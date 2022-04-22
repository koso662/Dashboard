package com.template.common.exception;

import com.template.common.bean.DomainResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public DomainResponse exceptionHandler(Exception e) {
        log.error("Exception: {}", e.getMessage(), e);

        return DomainResponse.create(e);
    }


    @ExceptionHandler(TemplateException.class)
    public DomainResponse exceptionHandler(TemplateException e) {
        log.error("Exception: {} : {}", e.getResultCode(), e.getResultCode().getMessage(), e);
        // Exception: -1 : Fail.
        // Exception: 4001001 : 잘못된 요청입니다.
        return DomainResponse.create(e);
    }

}
