package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Curso;
import com.example.demo.repositories.CursoRepository;

@Service
public class CursoService {
    
    @Autowired
    private CursoRepository cursoRepository;

    public Curso getCurso(Integer idCurso) {
        Curso curso = cursoRepository.getReferenceById(idCurso);
        return curso;
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
