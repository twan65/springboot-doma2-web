package com.sample.web.search.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchRequestForm {

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
}
