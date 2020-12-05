package com.sample.common.constant;

import lombok.Getter;
import org.thymeleaf.util.ListUtils;

import java.util.ArrayList;
import java.util.List;

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

    public static List<String> convertCodesToLabels(List<Integer> codes) {
        List<String> labels = new ArrayList<>();

        if (ListUtils.isEmpty(codes)) {
            return labels;
        }

        for (InformationType type : InformationType.values()) {
            for (Integer code : codes) {
                if (type.code == code) {
                    labels.add(type.label);
                }
            }
        }

        return labels;
    }
}
