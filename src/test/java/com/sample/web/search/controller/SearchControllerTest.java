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

        assertThat("{VE00002}").isEqualTo(bindingResult.getFieldError().getDefaultMessage());
    }
}
