package com.sample.web.search.controller;

import com.sample.common.constant.ViewNames;

import com.sample.web.search.model.SearchRequestForm;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SearchControllerTest {

    @Autowired
    SearchController searchController;

    private MockMvc mockMvc;

    private final static String FORM_NAME_SEARCH = "searchRequestForm";
    private final static String URL_SEARCH = "/search";
    private final static List<String> NG_DATE_FORMATS = new ArrayList<>(){
        {
            add("2020/12/12");
            add("2020.12.12");
            add("2020-12-12");
        }
    };

    private final static List<Integer> NG_INFORMATION_TYPES = new ArrayList<>(){
        {
            add(-1);
            add(0);
            add(5);
        }
    };

    @Before
    public void init() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(searchController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .build();
    }

    @Test
    @DisplayName("検索画面が返却されること")
    public void searchTest() throws Exception {
        mockMvc.perform(get(URL_SEARCH))
                .andExpect(status().is2xxSuccessful())
                .andExpect(view().name(ViewNames.SEARCH_PAGE));
    }

    @Test
    @DisplayName("タイトルが30文字超えた場合")
    public void validateTitleOver30CharactersTest() throws Exception {
        SearchRequestForm form = new SearchRequestForm();
        form.setTitle("あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお");

        ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                .andExpect(model().hasErrors())
                .andExpect(model().errorCount(1));

        ModelAndView mnv = actions.andReturn().getModelAndView();
        BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

        assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00002}");
    }

    @Test
    @DisplayName("概要が300文字超えた場合")
    public void validateOverviewOver300CharactersTest() throws Exception {
        SearchRequestForm form = new SearchRequestForm();
        form.setOverview("あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお" +
                "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお" +
                "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお" +
                "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお" +
                "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお" +
                "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお" +
                "あいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえおあいうえお");

        ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                .andExpect(model().hasErrors())
                .andExpect(model().errorCount(1));

        ModelAndView mnv = actions.andReturn().getModelAndView();
        BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

        assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00002}");
    }

    @Test
    @DisplayName("掲載開始日Fromのフォーマットが「yyyy年MM月dd日」ではない場合")
    public void validateDisplayStartDateFromFormatTest() throws Exception {

        for (String format : NG_DATE_FORMATS) {
            SearchRequestForm form = new SearchRequestForm();
            form.setDisplayStartDateFrom(format);

            ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                    .andExpect(model().hasErrors())
                    .andExpect(model().errorCount(1));

            ModelAndView mnv = actions.andReturn().getModelAndView();
            BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

            assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00003}");
        }

    }

    @Test
    @DisplayName("掲載開始日Toのフォーマットが「yyyy年MM月dd日」ではない場合")
    public void validateDisplayStartDateToFormatTest() throws Exception {

        for (String format : NG_DATE_FORMATS) {
            SearchRequestForm form = new SearchRequestForm();
            form.setDisplayStartDateTo(format);

            ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                    .andExpect(model().hasErrors())
                    .andExpect(model().errorCount(1));

            ModelAndView mnv = actions.andReturn().getModelAndView();
            BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

            assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00003}");
        }
    }

    @Test
    @DisplayName("掲載終了日Fromのフォーマットが「yyyy年MM月dd日」ではない場合")
    public void validateDisplayEndDateFromFormatTest() throws Exception {

        for (String format : NG_DATE_FORMATS) {
            SearchRequestForm form = new SearchRequestForm();
            form.setDisplayEndDateFrom(format);

            ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                    .andExpect(model().hasErrors())
                    .andExpect(model().errorCount(1));

            ModelAndView mnv = actions.andReturn().getModelAndView();
            BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

            assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00003}");
        }
    }

    @Test
    @DisplayName("掲載終了日Toのフォーマットが「yyyy年MM月dd日」ではない場合")
    public void validateDisplayEndDateToFormatTest() throws Exception {

        for (String format : NG_DATE_FORMATS) {
            SearchRequestForm form = new SearchRequestForm();
            form.setDisplayEndDateTo(format);

            ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                    .andExpect(model().hasErrors())
                    .andExpect(model().errorCount(1));

            ModelAndView mnv = actions.andReturn().getModelAndView();
            BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

            assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00003}");
        }
    }

    @Test
    @DisplayName("お知らせタイプコードが範囲外の場合")
    public void validateInformationTypeListTest() throws Exception {

        for (Integer type : NG_INFORMATION_TYPES) {
            SearchRequestForm form = new SearchRequestForm();
            List<Integer> informationTypeList = new ArrayList<>();
            informationTypeList.add(type);
            form.setInformationTypeList(informationTypeList);

            ResultActions actions = mockMvc.perform(get(URL_SEARCH).flashAttr(FORM_NAME_SEARCH, form))
                    .andExpect(model().hasErrors())
                    .andExpect(model().errorCount(1));

            ModelAndView mnv = actions.andReturn().getModelAndView();
            BindingResult bindingResult = (BindingResult) mnv.getModel().get(BindingResult.MODEL_KEY_PREFIX + FORM_NAME_SEARCH);

            assertThat(bindingResult.getFieldError().getDefaultMessage()).isEqualTo("{VE00006}");
        }
    }
}
