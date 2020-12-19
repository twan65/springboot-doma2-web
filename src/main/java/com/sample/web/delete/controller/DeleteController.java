package com.sample.web.delete.controller;

import com.sample.common.constant.MessageType;
import com.sample.web.delete.service.DeleteService;
import com.sample.web.login.model.CustomUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@RequiredArgsConstructor
@Controller
public class DeleteController {

  private final DeleteService deleteService;
  private final MessageSource messageSource;

  private static final String REDIRECT_SEARCH = "redirect:/search";

  /**
   * お知らせを削除する。
   * @param id お知らせID
   * @param user ユーザー情報
   * @param redirectAttributes
   * @return お知らせ検索画面
   */
  @DeleteMapping("/information/{id}")
  public String remove(
      @PathVariable Integer id,
      @AuthenticationPrincipal CustomUser user,
      RedirectAttributes redirectAttributes) {

    try {
      deleteService.remove(id, user.getUserId());
    } catch (IllegalArgumentException ex) {
      log.warn(ex.getMessage());
      redirectAttributes.addAttribute(
              MessageType.ERROR_MESSAGE.name(), messageSource.getMessage("VE00009", null, null));
      return REDIRECT_SEARCH;
    }

    redirectAttributes.addAttribute(
            MessageType.ERROR_MESSAGE.name(), messageSource.getMessage("SU00003", null, null));

    return REDIRECT_SEARCH;
  }
}
