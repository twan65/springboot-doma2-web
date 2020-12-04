package com.sample.common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;

import java.time.LocalDate;
import java.util.List;

@Getter
@Entity
public class SearchResponseEntity {

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
    @Setter
    private List<Integer> informationTypeList;

    @Builder
    public SearchResponseEntity(Integer id, String title, String overview, LocalDate publicationStartDate
    , LocalDate publicationEndDate) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.publicationStartDate = publicationStartDate;
        this.publicationEndDate = publicationEndDate;
    }
}
