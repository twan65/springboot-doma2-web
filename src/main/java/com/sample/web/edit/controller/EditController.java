package com.sample.web.edit.controller;

import com.sample.common.constant.InformationType;
import com.sample.common.constant.ViewNames;
import com.sample.web.edit.service.EditService;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class EditController {

  private final EditService editService;
  private static final String REDIRECT_SEARCH = "redirect:/search";

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
}
