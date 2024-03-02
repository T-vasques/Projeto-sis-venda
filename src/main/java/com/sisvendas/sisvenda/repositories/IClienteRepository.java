package com.sisvendas.sisvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sisvendas.sisvenda.models.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    
}
