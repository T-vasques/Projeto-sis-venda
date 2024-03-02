package com.sisvendas.sisvenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sisvendas.sisvenda.models.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long>{
    
}
