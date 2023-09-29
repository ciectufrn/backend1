package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Integer>{
    
}
