package com.sisvendas.sisvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sisvendas.sisvenda.models.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido,Long> {
    
}
