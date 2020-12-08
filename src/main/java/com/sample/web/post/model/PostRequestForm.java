package com.sample.web.post.model;

import com.sample.common.constant.DeleteFlag;
import com.sample.common.entity.InformationEntity;
import com.sample.common.utils.DateConverter;
import com.sample.common.validation.DateFormatValid;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PostRequestForm {

    // お知らせID
    private Integer id;

    // タイトル
    @NotBlank(message = "{VE00001}")
    @Max(value = 30, message = "{VE00002}")
    private String title;

    // お知らせ概要
    @NotBlank(message = "{VE00001}")
    @Max(value = 300, message = "{VE00002}")
    private String overview;

    // 掲載開始日
    @NotBlank(message = "{VE00001}")
    @DateFormatValid(message = "{VE00003}")
    private String displayStartDate;

    // 掲載終了日
    @NotBlank(message = "{VE00001}")
    @DateFormatValid(message = "{VE00003}")
    private String displayEndDate;

    // お知らせタイプリスト
    @NotNull(message = "{VE00001}")
    private List<@Min(value = 1, message = "{VE00006}") @Max(value = 4, message = "{VE00006}") Integer> informationTypeList;

    public InformationEntity toEntity(String userId) {
    return InformationEntity.builder()
        .title(title)
        .overview(overview)
        .displayStartDate(DateConverter.convertStringToLocalDate(displayStartDate))
        .displayEndDate(DateConverter.convertStringToLocalDate(displayEndDate))
        .isDelete(DeleteFlag.NOT_DELETE.getFlag())
        .createId(userId)
        .updateId(userId)
        .createDateTime(LocalDateTime.now())
        .updateDateTime(LocalDateTime.now())
        .build();
    }
}
