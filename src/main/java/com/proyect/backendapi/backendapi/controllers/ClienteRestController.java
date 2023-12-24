package com.proyect.backendapi.backendapi.controllers;

import com.proyect.backendapi.backendapi.model.entity.Cliente;
import com.proyect.backendapi.backendapi.models.services.ClienteServiceImpl;
import com.proyect.backendapi.backendapi.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();

    }
}
