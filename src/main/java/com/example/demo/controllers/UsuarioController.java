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

import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/{idUsuario}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR", })
    public Usuario getUsuario(@PathVariable Integer idUsuario) {
        Usuario usuario = usuarioService.getUsuario(idUsuario);
        return usuario;
    }

    @PostMapping
    @Secured(value = { "ROLE_ADMIN" })
    public void cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
    }

    @PutMapping
    @Secured(value = { "ROLE_ADMIN" })
    public void atualizarUsuario(@RequestBody Usuario usuario) {
        usuarioService.atualizar(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    @Secured(value = { "ROLE_ADMIN" })
    public void removerUsuario(@PathVariable Integer idUsuario) {
        usuarioService.remover(idUsuario);
    }
}
