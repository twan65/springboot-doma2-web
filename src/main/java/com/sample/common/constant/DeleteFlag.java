package com.sample.common.constant;

import lombok.Getter;

@Getter
public enum DeleteFlag {
    NOT_DELETE(0),
    DELETE(1);

    private final int flag;

    DeleteFlag(int flag) {
        this.flag = flag;
    }

    public int value() {
        return flag;
    }
}
