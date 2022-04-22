package com.template.common.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Deprecated
@RequiredArgsConstructor
public class ResultCodeV2 {
    private final int code;
    private final String message;

    public static final ResultCodeV2 SUCCESS = new ResultCodeV2(0, "Success. ");
    public static final ResultCodeV2 FAIL = new ResultCodeV2(-1, "Fail. ");


    public boolean isSuccess() {
        return this == ResultCodeV2.SUCCESS;
    }


    public static void main(String[] args) {

        if (ResultCodeV2.SUCCESS.isSuccess()) {

        } else {

        }

        String str1 = "aaa";
        String str2 = "aaa";
        if (str1 == str2) {
            // Error
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        if (str1.equals(str2)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }

        if (ResultCodeV2.SUCCESS == ResultCodeV2.SUCCESS) {
            // Error
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }

}
