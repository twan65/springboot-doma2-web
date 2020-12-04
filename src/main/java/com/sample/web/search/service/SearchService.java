package com.sample.web.search.service;

import com.sample.common.dao.SearchDao;
import com.sample.common.entity.SearchResponseEntity;
import com.sample.web.search.model.SearchRequestForm;
import com.sample.web.search.model.SearchResponseForm;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * お知らせ一覧のサービス
 */
@Service
public class SearchService {

    @Autowired
    private SearchDao searchDao;

    public Page<SearchResponseForm> findSearchData(SearchRequestForm form, Pageable pageable) {

        val searchEntity = form.toEntity();
        val searchResponseFormList = new ArrayList<SearchResponseForm>();

        // 検索対象の件数を取得
        Integer count = searchDao.countSearchTargetBy(searchEntity);

        if (count > 0) {
            // 検索データを取得する。
            val responseEntityList = searchDao.selectInformationListBy(searchEntity);
            for (SearchResponseEntity entity : responseEntityList) {
                // お知らせ種別を取得し、セット
                entity.setInformationTypeList(searchDao.selectInformationTypeListBy(entity.getId()));
                searchResponseFormList.add(SearchResponseForm.builder().entity(entity).build());
            }
        }

        return new PageImpl<>(searchResponseFormList, pageable,count);
    }
}
