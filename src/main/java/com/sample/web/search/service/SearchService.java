package com.sample.web.search.service;

import com.sample.common.dao.InformationDao;
import com.sample.common.dao.InformationTypeDao;
import com.sample.common.entity.SearchResponseEntity;
import com.sample.web.search.model.SearchRequestForm;
import com.sample.web.search.model.SearchResponseForm;
import lombok.val;
import org.seasar.doma.boot.Pageables;
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
    private InformationDao searchDao;

    @Autowired
    private InformationTypeDao informationTypeDao;

    public Page<SearchResponseForm> findSearchData(SearchRequestForm form, Pageable pageable) {

        val searchEntity = form.toEntity();
        val searchResponseFormList = new ArrayList<SearchResponseForm>();

        // 検索対象の件数を取得
        Integer count = searchDao.countSearchTargetBy(searchEntity);

        if (count > 0) {
            // 検索データを取得する。
            val options = Pageables.toSelectOptions(pageable);
            val responseEntityList = searchDao.selectInformationListBy(searchEntity, options);
            for (SearchResponseEntity entity : responseEntityList) {
                // お知らせ種別を取得し、セット
                List<Integer> informationTypes = informationTypeDao.selectInformationTypeListBy(entity.getId());
                searchResponseFormList.add(SearchResponseForm.builder().entity(entity).informationTypeList(informationTypes).build());
            }
        }

        return new PageImpl<>(searchResponseFormList, pageable,count);
    }
}
