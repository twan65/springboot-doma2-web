package com.sample.web.search.service;

import com.sample.web.search.model.SearchRequestForm;
import com.sample.web.search.model.SearchResponseForm;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SearchService {

    public Page<SearchResponseForm> findSearchData(SearchRequestForm form, Pageable pageable) {

        List<SearchResponseForm> searchResponseFormList = new ArrayList<>();
        return new PageImpl<>(searchResponseFormList, pageable,0);
    }
}
