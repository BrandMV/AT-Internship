package com.brandmv.springrest.services.Impl;

import com.brandmv.springrest.domain.ClienteResponse;
import com.brandmv.springrest.services.ICliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteImpl implements ICliente {
    @Override
    public ClienteResponse getClient(String name, String lastName, String birthday, long clientId) {
        return new ClienteResponse(name, lastName, birthday, clientId);
    }
}
