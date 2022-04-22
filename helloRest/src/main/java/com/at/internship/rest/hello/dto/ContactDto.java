package com.at.internship.rest.hello.dto;

import lombok.Data;

@Data
public class ContactDto {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String phoneNumber;
    private final String birthDay;

}
