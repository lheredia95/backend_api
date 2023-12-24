package com.proyect.backendapi.backendapi.models.services;

import com.proyect.backendapi.backendapi.model.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
