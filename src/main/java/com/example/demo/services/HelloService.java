package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Requisicao;
import com.example.demo.repositories.RequisicaoRepository;

@Service
public class HelloService {

    @Autowired
    private RequisicaoRepository requisicaoRepository;

    public Integer quantidadeGets() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        Integer getsDoBanco = requisicao.getGets();
        requisicao.setGets(getsDoBanco + 1);
        requisicaoRepository.save(requisicao);
        return requisicao.getGets();
    }

    public Integer quantidadePosts() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        return requisicao.getPosts();
    }

    public Integer quantidadePuts() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        return requisicao.getPuts();
    }

    public Integer quantidadeDeletes() {
        Requisicao requisicao = requisicaoRepository.getReferenceById(1);
        return requisicao.getDeletes();
    }
}
