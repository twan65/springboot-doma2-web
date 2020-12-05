package com.sample.common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
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
    @Column(name = "display_start_date")
    private LocalDate displayStartDate;

    // 掲載終了日
    @Column(name = "display_end_date")
    private LocalDate displayEndDate;

    // 登録日
    @Column(name = "create_date_time")
    private LocalDateTime createDateTime;

    @Builder
    public SearchResponseEntity(Integer id, String title, String overview, LocalDate displayStartDate
    , LocalDate displayEndDate, LocalDateTime createDateTime) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.displayStartDate = displayStartDate;
        this.displayEndDate = displayEndDate;
        this.createDateTime = createDateTime;
    }
}
