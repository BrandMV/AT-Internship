package com.at.internship.schedule.repository;

import com.at.internship.schedule.domain.Contact;
import com.at.internship.schedule.serialization.csv.ContactSerializer;
import com.at.internship.schedule.specification.SpecificationUtils;

import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactRepository {
    private static int ID_SEQUENCE = 0;

    private List<Contact> contactList;
    private final ContactSerializer contactSerializer;

    ContactRepository() {
        contactSerializer = new ContactSerializer();
        contactList = contactSerializer.deserialize();
        ID_SEQUENCE = contactList.stream().map(Contact::getId).max(Integer::compare).orElse(0);
    }

    public synchronized List<Contact> findAll() {
        return contactList
                .stream() // contactList genera stream de salida a través de la función stream()
                // Stream de entrada va a la operación map
                .map(Contact::new)
                // Map genera stream de salida
                // Stream de entrada va a la operación collect
                .collect(Collectors.toList());
    }

    public synchronized List<Contact> findAll(Predicate<Contact> predicate) {
        if(predicate == null)
            return findAll();
        // La referencia al método puede reemplazar la expresión lambda
        return contactList
                .stream()
                .filter(predicate)
                // filter() -> stream -> map()
                .map(Contact::new)
                .collect(Collectors.toList());
    }

    public synchronized Optional<Contact> findOne(Integer id) {
        return contactList
                .stream().filter(a -> Objects.equals(a.getId(), id))
                .findFirst();
    }

    public synchronized Contact save(Contact c) throws IOException {
        Contact clone = new Contact(c);
        if(clone.getId() == null)
            clone.setId(++ID_SEQUENCE);

        int index = contactList.indexOf(c);
        if(index > -1)
            contactList.set(index, clone);
        else
            contactList.add(clone);

        contactSerializer.serialize(contactList);

        return new Contact(clone);
    }

    public synchronized void delete(Integer id) throws IOException {
        contactList = contactList
                .stream()
                .filter(c -> !c.getId().equals(id))
                .collect(Collectors.toList());
        contactSerializer.serialize(contactList);
    }

    public List<Contact> findAllByName(String name) {
        return contactList
                .stream()
                .filter(c -> SpecificationUtils.like(String.format("%s %s", c.getFirstName(), c.getLastName()), name))
                .map(Contact::new)
                .collect(Collectors.toList());
    }

}
