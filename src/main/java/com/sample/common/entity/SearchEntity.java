package com.sample.common.entity;

import lombok.Builder;
import org.seasar.doma.Entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
public class SearchEntity {

    // タイトル
    private String title;

    // 概要
    private String overview;

    // 掲載開始日FROM
    private String publicationStartDateFrom;

    // 掲載開始日TO
    private String publicationStartDateTo;

    // 掲載終了日FROM
    private String publicationEndDateFrom;

    // 掲載終了日TO
    private String publicationEndDateTo;

    // お知らせタイプリスト
    private List<Integer> informationTypeList;


    @Builder
    public SearchEntity(String title, String overview, String publicationStartDateFrom, String publicationStartDateTo
    , String publicationEndDateFrom, String publicationEndDateTo, List<Integer> informationTypeList) {
        this.title = title;
        this.overview = overview;
        this.publicationStartDateFrom = publicationStartDateFrom;
        this.publicationStartDateTo = publicationStartDateTo;
        this.publicationEndDateFrom = publicationEndDateFrom;
        this.publicationEndDateTo = publicationEndDateTo;
        this.informationTypeList = informationTypeList;
    }
}
