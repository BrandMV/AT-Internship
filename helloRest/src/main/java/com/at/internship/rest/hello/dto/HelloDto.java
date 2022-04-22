package com.at.internship.rest.hello.dto;

import lombok.Data;
/*Data generates setters and getters*/
@Data
public class HelloDto {
    private String message;

    public HelloDto(String message){
        this.message = message;
    }
}
