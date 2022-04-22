package com.template.common.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResultCode {

    SUCCESS(0, "Success. "),
    FAIL(-1, "Fail. "),

    ;

    private final int code;
    private final String message;


    public boolean isSuccess() {
        return this == ResultCode.SUCCESS;
    }
}
