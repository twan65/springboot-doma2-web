package com.sample.web.search.model;

import com.sample.common.entity.SearchEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Getter
@Setter
public class SearchRequestForm {

    // タイトル
    @Max(value = 30, message = "30文字以下で入力してください")
    private String title;

    // 概要
    @Max(value = 300, message = "300文字以下で入力してください")
    private String overview;

    // 掲載開始日FROM
    // TODO: DataFormatValidation
    private String publicationStartDateFrom;

    // 掲載開始日TO
    // TODO: DataFormatValidation
    private String publicationStartDateTo;

    // 掲載終了日FROM
    // TODO: DataFormatValidation
    private String publicationEndDateFrom;

    // 掲載終了日TO
    // TODO: DataFormatValidation
    private String publicationEndDateTo;

    // お知らせタイプリスト
    private List<@Min(value = 1, message = "入力したコードは存在しません") @Max(value = 4, message = "入力したコードは存在しません") Integer> informationTypeList;


    /**
     * SearchRequestFormのEntityクラスを返却する。
     * @return SearchEntity
     */
    public SearchEntity toEntity() {
        return SearchEntity.builder()
                .title(title)
                .overview(overview)
                .publicationStartDateFrom(publicationStartDateFrom)
                .publicationStartDateTo(publicationStartDateTo)
                .publicationEndDateFrom(publicationEndDateFrom)
                .publicationEndDateTo(publicationEndDateTo)
                .informationTypeList(informationTypeList)
                .build();
    }

}
