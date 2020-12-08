package com.sample.web.post.controller;

import com.sample.common.constant.InformationType;
import com.sample.common.constant.ViewNames;
import com.sample.web.login.model.CustomUser;
import com.sample.web.post.model.PostRequestForm;
import com.sample.web.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/** お知らせ登録のコントローラー */
@RequiredArgsConstructor
@Controller
public class PostController {

  private final PostService postService;
  private final MessageSource messageSource;

  private static final String POST_REQUEST_FORM_ATTR = "postRequestForm";
  private static final String SAVE_RESULT_ATTR = "saveResult";
  private static final String INFO_MESSAGE_ATTR = "infoMessage";
  private static final String INFORMATION_TYPE_LIST_ATTR = "informationTypes";
  private static final String REDIRECT_POST = "redirect:/post";

  /**
   * お知らせ登録画面を返却する。
   * @param postRequestForm お知らせ登録フォーム
   * @param saveResult お知らせ登録結果
   * @param model
   * @return
   */
  @GetMapping("/post")
  public String index(
      @ModelAttribute PostRequestForm postRequestForm,
      @ModelAttribute boolean saveResult,
      Model model) {

    model.addAttribute(INFORMATION_TYPE_LIST_ATTR, InformationType.values());

    if (saveResult) {
      model.addAttribute(INFO_MESSAGE_ATTR, messageSource.getMessage("SU00001", null, null));
    }

    return ViewNames.POST_PAGE;
  }

  /**
   * お知らせ登録確認画面を返却します。
   * @param postRequestForm お知らせ登録フォーム
   * @param bindingResult
   * @param model
   * @return
   */
  @PostMapping("/post/confirm")
  public String confirm(
      @ModelAttribute @Validated PostRequestForm postRequestForm,
      BindingResult bindingResult,
      Model model) {

    model.addAttribute(INFORMATION_TYPE_LIST_ATTR, InformationType.values());

    if (bindingResult.hasErrors()) {
      model.addAttribute(POST_REQUEST_FORM_ATTR, postRequestForm);
      return ViewNames.POST_PAGE;
    }

    return ViewNames.POST_CONFIRM_PAGE;
  }

  /**
   * お知らせを登録する。
   * @param postRequestForm お知らせ登録フォーム
   * @param bindingResult
   * @param user ログインユーザー情報
   * @param redirectAttributes リダイレクトモデル
   * @param model
   * @return
   */
  @PostMapping("/post")
  public String save(
      @ModelAttribute @Validated PostRequestForm postRequestForm,
      BindingResult bindingResult,
      @AuthenticationPrincipal CustomUser user,
      RedirectAttributes redirectAttributes,
      Model model) {

    if (bindingResult.hasErrors()) {
      redirectAttributes.addAttribute(POST_REQUEST_FORM_ATTR, postRequestForm);
      return REDIRECT_POST;
    }

    postService.save(postRequestForm, user.getUserId());

    redirectAttributes.addAttribute(SAVE_RESULT_ATTR, true);
    return REDIRECT_POST;
  }
}
