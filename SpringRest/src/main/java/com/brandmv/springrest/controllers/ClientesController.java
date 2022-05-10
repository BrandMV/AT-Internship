package com.brandmv.springrest.controllers;

import com.brandmv.springrest.domain.ClienteResponse;
import com.brandmv.springrest.services.ICliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientesController {
    ICliente cliente;
    public ClientesController(ICliente cliente){this.cliente = cliente;}

    //@ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/saludo")
    public ResponseEntity<String> saludo() {
        String saludo = "Hello World!";
        return new ResponseEntity<String>(saludo, HttpStatus.OK);
        //return ResponseEntity.ok().build();
    }

    @GetMapping("/saludo/{nombre}")
    public ResponseEntity<String> saludoConNombrePathParameter(
            @PathVariable
            String nombre) {
        String response;

        if (nombre.length() < 2) {
            response = "Nombre inválido";
            return new ResponseEntity<String>(response, HttpStatus.BAD_REQUEST);
        }

        response = "Saludos " + nombre;
        return new ResponseEntity<String>(response, HttpStatus.OK);
        //return ResponseEntity.ok().build();
    }

    @GetMapping("/client")
    public ResponseEntity<ClienteResponse> getUserQueryParams(
            @RequestParam("name") String name,
            @RequestParam("lastName") String lastName,
            @RequestParam("birthday") String birthday,
            @RequestParam("clientId") String clientId
            ){

        if(name.length() < 3 || lastName.length() < 2 || clientId.length() < 5)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(cliente.getClient(name, lastName, birthday, Long.valueOf(clientId)), HttpStatus.OK);
    }



    /**
     * Crear Handler:
     * GET
     * QueryParams Nombre, Apellido, Fecha de Nacimiento, Numero Cliente
     * ResponseEntity<ClienteResponse>
     *      Nombre : String
     *      Apellido : String
     *      Fecha Nacimiento (yyyy-mm-dd) : String
     *      Numero Cliente : long
     * Status Code: 200
     * Nombre > 3 digitos, apellido > 2 digitos, numero cliente > 5 digitos : BAD REQUEST
     */
}