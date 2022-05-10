package com.brandmv.springrest.services;

import com.brandmv.springrest.domain.ClienteResponse;

public interface ICliente {
    ClienteResponse getClient(String name, String lastName, String birthday, long clientId);
}
