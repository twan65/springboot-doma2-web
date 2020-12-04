package com.sample.web.search.controller;

import com.sample.common.constant.InformationType;
import com.sample.common.constant.ViewNames;
import com.sample.web.search.model.SearchRequestForm;
import com.sample.web.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


/**
 * お知らせ一覧コントローラー
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/search")
    public String findSearchData(@ModelAttribute @Validated SearchRequestForm searchRequestForm, BindingResult bindResult,
                                 @PageableDefault(page = 0, size = 10) Pageable pageable, Model model) {

        model.addAttribute("informationTypes", InformationType.values());

        if (bindResult.hasErrors()) {
            return ViewNames.SEARCH_PAGE;
        }

        model.addAttribute("result", searchService.findSearchData(searchRequestForm, pageable));
        return ViewNames.SEARCH_PAGE;
    }
}
