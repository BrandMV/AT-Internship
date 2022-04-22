package com.at.internship.rest.hello.controller;

import com.at.internship.rest.hello.domain.Contact;
import com.at.internship.rest.hello.dto.ContactDto;
import com.at.internship.rest.hello.service.IContact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class ContactController {
    private IContact contact;

    public ContactController(IContact contact){
        this.contact = contact;
    }

    @GetMapping("contacts")
    public List<ContactDto> getAllContacts(){
        return contact.getAllContacts();
    }
}
