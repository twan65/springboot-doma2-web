package com.sample.web.search.model;

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
    private LocalDate publicationStartDate;

    // 掲載終了日
    private LocalDate publicationEndDate;

    // お知らせタイプリスト
    private List<Integer> informationTypeList;

    // 登録日
    private LocalDateTime createDateTime;

    @Builder
    public SearchResponseForm(SearchResponseEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.overview = entity.getOverview();
        this.publicationStartDate = entity.getPublicationStartDate();
        this.publicationEndDate = entity.getPublicationEndDate();
        this.informationTypeList = entity.getInformationTypeList();
        this.createDateTime = entity.getCreateDateTime();

    }

}
