package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Requisicao;
import com.example.demo.repositories.RequisicaoRepository;

@Service
public class HelloService {

    @Autowired
    private RequisicaoRepository requisicaoRepository;

    Integer quantidadeGets = 0;
    Integer quantidadePosts = 0;
    Integer quantidadePuts = 0;
    Integer quantidadeDeletes = 0;

    public Integer quantidadeGets() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        return requisicao.getGets();
    }

    public Integer quantidadePosts() {
        return ++quantidadePosts;
    }

    public Integer quantidadePuts() {
        return ++quantidadePuts;
    }

    public Integer quantidadeDeletes() {
        return ++quantidadeDeletes;
    }
}
