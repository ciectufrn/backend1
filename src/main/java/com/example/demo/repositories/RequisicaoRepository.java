package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Requisicao;

public interface RequisicaoRepository extends JpaRepository<Requisicao, Integer>{
    
}
