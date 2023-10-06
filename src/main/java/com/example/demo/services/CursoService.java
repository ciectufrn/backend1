package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Curso;
import com.example.demo.repositories.CursoRepository;

@Service
public class CursoService {
    
    @Autowired
    private CursoRepository cursoRepository;

    public Curso getCurso(Integer idCurso) {
        Optional<Curso> curso = cursoRepository.findById(idCurso);
        return curso.get();
    }

    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso atualizar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void remover(Integer idCurso) {
        cursoRepository.deleteById(idCurso);
    }


}
