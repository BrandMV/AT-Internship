package com.at.internship.rest.hello.domain;

import lombok.Data;

import java.time.LocalDate;


@Data
public class Contact {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String phoneNumber;
    private final LocalDate birthDay;

    /*
    public Contact(Integer id, String firstName, String lastName, String emailAddress, String phoneNumber, LocalDate birthDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
    }
    */
}
/**
 * cargar una lista de contactos en memoria
 * Crear un servicio de tipo get que devuelva la lista completa
 * El cumpleaños debe tener formato de fecha "dd/mm/yyyy"
 * Crear DTO y este regresa atributos de contact, pero la fecha se regresa con el formato
 * La respuesta es un contact DTO, parecido a lo que hay en esta clase pero brithday sera string
 */
