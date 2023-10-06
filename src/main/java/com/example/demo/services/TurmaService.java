package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Turma;
import com.example.demo.repositories.TurmaRepository;

@Service
public class TurmaService {
    
    @Autowired
    private TurmaRepository turmaRepository;

    public Turma getTurma(Integer idTurma) {
        Optional<Turma> turma = turmaRepository.findById(idTurma);
        return turma.get();
    }

    public Turma salvar(Turma turma) {
        return turmaRepository.save(turma);
    }

    public Turma atualizar(Turma turma) {
        return turmaRepository.save(turma);
    }

    public void remover(Integer idTurma) {
        turmaRepository.deleteById(idTurma);
    }


}
