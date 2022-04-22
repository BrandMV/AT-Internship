package com.at.internship.rest.hello.service.impl;

import com.at.internship.rest.hello.domain.Contact;
import com.at.internship.rest.hello.dto.ContactDto;
import com.at.internship.rest.hello.service.IContact;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactImpl implements IContact {

    private List<Contact> contacts = Arrays.asList(
                new Contact(1, "Brandon", "Meza", "brandon@email.com", "5610690179",
                            LocalDate.parse("2001-05-19")
                        ),
                new Contact(1, "Jonathan", "Hernandez", "Jonathan@email.com", "5610690190",
                        LocalDate.parse("2001-08-20")
                        ),
                new Contact(1, "Lizeth", "Gonzalez", "Lizeth@email.com", "5610690165",
                        LocalDate.parse("2001-02-12")
                        ),
                new Contact(1, "Erik", "Bocio", "Erik@email.com", "5610690143",
                        LocalDate.parse("2001-08-25")
                        ),
                new Contact(1, "David", "Vargas", "Davidemail.com", "5610690121",
                        LocalDate.parse("2001-05-01")
                        )
        );

    @Override
    public List<ContactDto> getAllContacts() {
        return contacts.stream().map(c ->
            new ContactDto(c.getId(), c.getFirstName(), c.getLastName(), c.getEmailAddress(), c.getPhoneNumber(),
                            c.getBirthDay().format(DateTimeFormatter.ofPattern("dd/MM/uuuu")))).collect(Collectors.toList());
    }
}
