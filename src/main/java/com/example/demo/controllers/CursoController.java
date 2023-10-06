package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Curso;
import com.example.demo.services.CursoService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;
    
    @GetMapping("/{idCurso}")
    public Curso getCurso(@PathVariable Integer idCurso) throws JsonProcessingException {
        Curso curso = cursoService.getCurso(idCurso);
        return curso;
    }
}
