package com.at.internship.rest.hello.service;

import com.at.internship.rest.hello.domain.Contact;
import com.at.internship.rest.hello.dto.ContactDto;

import java.util.List;

public interface IContact {

    List<ContactDto> getAllContacts();
}
