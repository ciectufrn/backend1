package com.example.demo.entities;

import com.example.demo.enums.Papel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;

@NamedQuery(name = "Usuario.getUsuarioPorLogin", query = "SELECT u FROM Usuario u WHERE u.login=:login")

@Entity
@Getter @Setter
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false)
  private String login;

  @Column(nullable = false, updatable = false)
  private String senha;

  @Enumerated(EnumType.STRING)
	@Column(nullable = false, updatable = false)
	private Papel papel;
}
