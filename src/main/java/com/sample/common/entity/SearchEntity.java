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
    private String displayStartDateFrom;

    // 掲載開始日TO
    private String displayStartDateTo;

    // 掲載終了日FROM
    private String displayEndDateFrom;

    // 掲載終了日TO
    private String displayEndDateTo;

    // お知らせタイプリスト
    private List<Integer> informationTypeList;


    @Builder
    public SearchEntity(String title, String overview, String displayStartDateFrom, String displayStartDateTo
    , String displayEndDateFrom, String displayEndDateTo, List<Integer> informationTypeList) {
        this.title = title;
        this.overview = overview;
        this.displayStartDateFrom = displayStartDateFrom;
        this.displayStartDateTo = displayStartDateTo;
        this.displayEndDateFrom = displayEndDateFrom;
        this.displayEndDateTo = displayEndDateTo;
        this.informationTypeList = informationTypeList;
    }
}
