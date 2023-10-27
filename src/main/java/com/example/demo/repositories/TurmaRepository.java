package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Integer>{
    List<Turma> getTurmasPorCurso(Integer idCurso);
}
