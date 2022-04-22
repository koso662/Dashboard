package com.template.common.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainHeader {

    private boolean isSuccessful;
    private int status;
    private String statusTxt;

}
