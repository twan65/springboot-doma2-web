package com.sample.web.edit.controller;

import com.sample.common.constant.InformationType;
import com.sample.common.constant.MessageType;
import com.sample.common.constant.ViewNames;
import com.sample.web.edit.service.EditService;
import com.sample.web.login.model.CustomUser;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@RequiredArgsConstructor
@Controller
public class EditController {

  private final EditService editService;
  private final MessageSource messageSource;

  private static final String REDIRECT_SEARCH = "redirect:/search";
  private static final String REDIRECT_EDIT = "redirect:/edit/";

  /**
   * 編集画面を返却する。
   * @param id お知らせID
   * @param postRequestForm お知らせリクエストフォーム
   * @param model
   * @param redirectAttributes
   * @return 編集画面
   */
  @GetMapping("/edit/{id}")
  public String editIndex(
      @PathVariable Integer id,
      @ModelAttribute PostRequestForm postRequestForm,
      Model model,
      RedirectAttributes redirectAttributes) {

    model.addAttribute("informationTypes", InformationType.values());

    try {
      PostRequestForm postResponseForm = editService.findById(id);
      model.addAttribute("postRequestForm", postResponseForm);
    } catch (IllegalArgumentException ex) {
      log.info(ex.getMessage());
      redirectAttributes.addAttribute(
          MessageType.ERROR_MESSAGE.name(), messageSource.getMessage("VE00008", null, null));
      return REDIRECT_SEARCH;
    }

    return ViewNames.EDIT_PAGE;
  }

  /**
   * 編集確認画面を返却する。
   * @param id お知らせID
   * @param postRequestForm お知らせリクエストフォーム
   * @param bindingResult
   * @param model
   * @param redirectAttributes
   * @return 編集確認画面
   */
  @PostMapping("/edit/{id}/confirm")
  public String editConfirmIndex(
      @PathVariable Integer id,
      @ModelAttribute @Validated PostRequestForm postRequestForm,
      BindingResult bindingResult,
      Model model,
      RedirectAttributes redirectAttributes) {

    model.addAttribute("informationTypes", InformationType.values());

    if (bindingResult.hasErrors()) {
      redirectAttributes.addAttribute(
          MessageType.ERROR_MESSAGE.name(), messageSource.getMessage("VE00000", null, null));
      return REDIRECT_EDIT + id;
    }

    return ViewNames.EDIT_CONFIRM_PAGE;
  }

  /**
   * 更新処理を行う。
   * @param id お知らせID
   * @param postRequestForm お知らせリクエストフォーム
   * @param user ユーザー情報
   * @param bindingResult
   * @param model
   * @param redirectAttributes
   * @return
   */
  @PostMapping("/edit/{id}")
  public String edit(
      @PathVariable Integer id,
      @ModelAttribute @Validated PostRequestForm postRequestForm,
      @AuthenticationPrincipal CustomUser user,
      BindingResult bindingResult,
      Model model,
      RedirectAttributes redirectAttributes) {

    if (bindingResult.hasErrors()) {
      redirectAttributes.addAttribute(
          MessageType.ERROR_MESSAGE.name(), messageSource.getMessage("VE00000", null, null));
      return REDIRECT_EDIT + id;
    }

    // 更新処理
    try {
      editService.edit(postRequestForm, user.getUserId());
    } catch (IllegalArgumentException ex) {
      log.info(ex.getMessage());
      redirectAttributes.addAttribute(
          MessageType.ERROR_MESSAGE.name(), messageSource.getMessage("VE00007", null, null));
    }

    // 正常更新メッセージのセット
    redirectAttributes.addAttribute(
        MessageType.INFO_MESSAGE.name(), messageSource.getMessage("SU00002", null, null));

    return REDIRECT_SEARCH;
  }
}
