package com.sample.web.search.model;

import com.sample.common.constant.InformationType;
import com.sample.common.entity.SearchResponseEntity;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class SearchResponseForm {

    // id
    private Integer id;

    // タイトル
    private String title;

    // 概要
    private String overview;

    // 掲載開始日
    private LocalDate displayStartDate;

    // 掲載終了日
    private LocalDate displayEndDate;

    // お知らせタイプリスト
    private List<String> informationTypeList;

    // 登録日
    private LocalDateTime createDateTime;

    @Builder
    public SearchResponseForm(SearchResponseEntity entity, List<Integer> informationTypeList) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.overview = entity.getOverview();
        this.displayStartDate = entity.getDisplayStartDate();
        this.displayEndDate = entity.getDisplayEndDate();
        this.createDateTime = entity.getCreateDateTime();
        this.informationTypeList = InformationType.convertCodesToLabels(informationTypeList);

    }

}
