package com.proyect.backendapi.backendapi.models.dao;

import com.proyect.backendapi.backendapi.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
