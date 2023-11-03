package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Curso;
import com.example.demo.services.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;
    
    @GetMapping("/{idCurso}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public Curso getCurso(@PathVariable Integer idCurso) {
        Curso curso = cursoService.getCurso(idCurso);
        return curso;
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void cadastrarCurso(@RequestBody Curso curso) {
        cursoService.salvar(curso);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizarCurso(@RequestBody Curso curso) {
        cursoService.atualizar(curso);
    }

    @DeleteMapping("/{idCurso}")
    @Secured(value = { "ROLE_GESTOR" })
    public void removerCurso(@PathVariable Integer idCurso) {
        cursoService.remover(idCurso);
    }
}
