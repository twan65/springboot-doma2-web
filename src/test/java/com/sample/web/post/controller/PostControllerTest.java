package com.sample.web.post.controller;

import com.sample.common.constant.ViewNames;
import com.sample.web.post.model.PostRequestForm;
import com.sample.web.search.model.SearchRequestForm;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostControllerTest {

  @Autowired PostController postController;

  private MockMvc mockMvc;

  private static final String FORM_NAME_POST = "postRequestForm";
  private static final String URL_POST = "/post";
  private static final String URL_POST_CONFIRM = "/post/confirm";

  private static final List<String> NG_DATE_FORMATS =
      new ArrayList<>() {
        {
          add("2020/12/12");
          add("2020.12.12");
          add("2020-12-12");
        }
      };

  private static final List<Integer> NG_INFORMATION_TYPES =
      new ArrayList<>() {
        {
          add(-1);
          add(0);
          add(5);
        }
      };

  @Before
  public void init() {
    this.mockMvc = MockMvcBuilders.standaloneSetup(postController).build();
  }

  @Test
  @DisplayName("お知らせ登録画面が返却されること")
  public void postTest() throws Exception {
    mockMvc
        .perform(get(URL_POST).flashAttr(FORM_NAME_POST, new PostRequestForm()))
        .andExpect(status().is2xxSuccessful())
        .andExpect(view().name(ViewNames.POST_PAGE));
  }

  @Test
  @DisplayName("お知らせ登録確認画面が返却されること")
  public void postConfirmTest() throws Exception {
    PostRequestForm form = getPostRequestForm();

    mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(status().is2xxSuccessful())
            .andExpect(view().name(ViewNames.POST_CONFIRM_PAGE));
  }

  @Test
  @DisplayName("タイトルが未入力場合")
  public void validateTitleEmptyTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setTitle("");

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00001}");
  }

  @Test
  @DisplayName("タイトルが30文字超えた場合")
  public void validateTitleOver30CharactersTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setTitle("あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお");

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00002}");
  }

  @Test
  @DisplayName("お知らせ概要が未入力場合")
  public void validateOverviewEmptyTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setOverview("");

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00001}");
  }

  @Test
  @DisplayName("概要が300文字超えた場合")
  public void validateOverviewOver300CharactersTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setOverview(
        "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお"
            + "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお"
            + "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお"
            + "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお"
            + "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお"
            + "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお"
            + "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお");

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00002}");
  }

  @Test
  @DisplayName("掲載開始日が未入力場合")
  public void validateDisplayStartDateEmptyTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setDisplayStartDate("");

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00001}");
  }

  @Test
  @DisplayName("掲載開始日のフォーマットが「yyyy年MM月dd日」ではない場合")
  public void validateDisplayStartDateFromFormatTest() throws Exception {
    PostRequestForm form = getPostRequestForm();

    for (String ngFormat : NG_DATE_FORMATS) {
      form.setDisplayStartDate(ngFormat);

      ResultActions actions =
          mockMvc
              .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
              .andExpect(model().hasErrors())
              .andExpect(model().errorCount(1));

      ModelAndView mnv = actions.andReturn().getModelAndView();
      BindingResult bindingResult =
          (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

      assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00003}");
    }
  }

  @Test
  @DisplayName("掲載終了日が未入力場合")
  public void validateDisplayEndDateEmptyTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setDisplayStartDate("");

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00001}");
  }

  @Test
  @DisplayName("掲載終了日のフォーマットが「yyyy年MM月dd日」ではない場合")
  public void validateDisplayEndDateFromFormatTest() throws Exception {
    PostRequestForm form = getPostRequestForm();

    for (String ngFormat : NG_DATE_FORMATS) {
      form.setDisplayEndDate(ngFormat);

      ResultActions actions =
          mockMvc
              .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
              .andExpect(model().hasErrors())
              .andExpect(model().errorCount(1));

      ModelAndView mnv = actions.andReturn().getModelAndView();
      BindingResult bindingResult =
          (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

      assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00003}");
    }
  }

  @Test
  @DisplayName("お知らせタイプが未入力場合")
  public void validateInformationTypeEmptyTest() throws Exception {
    PostRequestForm form = getPostRequestForm();
    form.setInformationTypeList(null);

    ResultActions actions =
        mockMvc
            .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
            .andExpect(model().hasErrors())
            .andExpect(model().errorCount(1));

    ModelAndView mnv = actions.andReturn().getModelAndView();
    BindingResult bindingResult =
        (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

    assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00001}");
  }

  @Test
  @DisplayName("お知らせタイプコードが範囲外の場合")
  public void validateInformationTypeListTest() throws Exception {
    PostRequestForm form = getPostRequestForm();

    for (Integer ngType : NG_INFORMATION_TYPES) {
      form.setInformationTypeList(Arrays.asList(ngType));

      ResultActions actions =
          mockMvc
              .perform(post(URL_POST_CONFIRM).flashAttr(FORM_NAME_POST, form))
              .andExpect(model().hasErrors())
              .andExpect(model().errorCount(1));

      ModelAndView mnv = actions.andReturn().getModelAndView();
      BindingResult bindingResult =
          (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_POST);

      assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00006}");
    }
  }

  private PostRequestForm getPostRequestForm() {
    return new PostRequestForm() {
      {
        setTitle("title");
        setOverview("overview");
        setDisplayStartDate("2020年12月16日");
        setDisplayEndDate("2020年12月20日");
        setInformationTypeList(Arrays.asList(1, 2));
      }
    };
  }
}
