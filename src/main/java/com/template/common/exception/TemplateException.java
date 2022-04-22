package com.template.common.exception;

import com.template.common.code.ResultCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TemplateException extends RuntimeException {

    private ResultCode resultCode;

}
