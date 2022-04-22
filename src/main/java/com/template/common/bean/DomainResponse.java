package com.template.common.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainResponse {

    private DomainHeader header;


    public static DomainResponse create(Exception e) {
        return new DomainResponse();
    }
}
