package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    Integer quantidadeGets = 0;
    Integer quantidadePosts = 0;
    Integer quantidadePuts = 0;
    Integer quantidadeDeletes = 0;

    public Integer quantidadeGets() {
        return ++quantidadeGets;
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
