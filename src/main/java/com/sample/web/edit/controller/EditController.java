package com.sample.web.edit.controller;

import com.sample.common.constant.InformationType;
import com.sample.common.constant.ViewNames;
import com.sample.web.edit.service.EditService;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
  private static final String REDIRECT_SEARCH = "redirect:/search";
  private static final String REDIRECT_EDIT = "redirect:/edit/";

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
    } catch (IllegalAccessException ex) {
      log.info("該当お知らせがありません。ID=" + id);
      redirectAttributes.addAttribute("errMsg", "該当お知らせがありません。");
      return REDIRECT_SEARCH;
    }

    return ViewNames.EDIT_PAGE;
  }

  @PostMapping("/edit/{id}/confirm")
  public String editConfirmIndex(
      @PathVariable Integer id,
      @ModelAttribute @Validated PostRequestForm postRequestForm,
      BindingResult bindingResult,
      Model model,
      RedirectAttributes redirectAttributes) {

    model.addAttribute("informationTypes", InformationType.values());

    if (bindingResult.hasErrors()) {
      redirectAttributes.addAttribute("errMsg", "入力に誤りがあります。");
      return REDIRECT_EDIT + id;
    }

    return ViewNames.EDIT_CONFIRM_PAGE;
  }
}
