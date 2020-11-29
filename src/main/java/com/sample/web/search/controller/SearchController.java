package com.sample.web.search.controller;

import com.sample.common.constant.ViewName;
import com.sample.web.search.model.SearchRequestForm;
import com.sample.web.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/search")
    public String findSearchData(@ModelAttribute SearchRequestForm searchRequestForm,
                                 @PageableDefault(page = 0, size = 10) Pageable pageable, Model model) {


        model.addAttribute("result", searchService.findSearchData(searchRequestForm, pageable));

        return ViewName.SEARCH_PAGE;
    }
}
