package com.sample.common.constant;

import lombok.Getter;

/**
 * お知らせのタイプ
 */
@Getter
public enum InformationType {

    COVID(1, "コロナ"),
    IT(2, "IT"),
    LIFE(3, "生活"),
    OTHER(4, "その他");

    private int code;
    private String label;

    InformationType(int code, String label) {
        this.code = code;
        this.label = label;
    }
}
