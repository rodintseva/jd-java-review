package com.cybertek.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

 // @AllArgsConstructor All arg constaractor or Static bloc can be used
public enum Status {
    OPEN("OPEN"),INPROGRESS("INPROGRESS"),UAT_TEST("UAT TESTING"),COMPLETED("COMPLETED");

    private final String value;
    Status (String value){
        this.value=value;
    }
}
