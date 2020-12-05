package com.sample.web.search.model;

import com.sample.common.entity.SearchEntity;
import com.sample.common.validation.DateFormatValid;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Getter
@Setter
public class SearchRequestForm {

    // タイトル
    @Max(value = 30, message = "{VE00002}")
    private String title;

    // 概要
    @Max(value = 300, message = "{VE00002}")
    private String overview;

    // 掲載開始日FROM
    @DateFormatValid(message = "{VE00003}")
    private String displayStartDateFrom;

    // 掲載開始日TO
    @DateFormatValid(message = "{VE00003}")
    private String displayStartDateTo;

    // 掲載終了日FROM
    @DateFormatValid(message = "{VE00003}")
    private String displayEndDateFrom;

    // 掲載終了日TO
    @DateFormatValid(message = "{VE00003}")
    private String displayEndDateTo;

    // お知らせタイプリスト
    private List<@Min(value = 1, message = "{VE00006}") @Max(value = 4, message = "{VE00006}") Integer> informationTypeList;


    /**
     * SearchRequestFormのEntityクラスを返却する。
     * @return SearchEntity
     */
    public SearchEntity toEntity() {
        return SearchEntity.builder()
                .title(title)
                .overview(overview)
                .displayStartDateFrom(displayStartDateFrom)
                .displayStartDateTo(displayStartDateTo)
                .displayEndDateFrom(displayEndDateFrom)
                .displayEndDateTo(displayEndDateTo)
                .informationTypeList(informationTypeList)
                .build();
    }

}
