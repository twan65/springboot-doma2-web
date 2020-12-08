package com.sample.common.constant;

import lombok.Getter;

@Getter
public enum DeleteFlag {
    NOT_DELETE(0),
    DELETE(1);

    int flag;

    DeleteFlag(int flag) {
        this.flag = flag;
    }
}
