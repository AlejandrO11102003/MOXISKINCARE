package com.example.demo.Entity;

import com.example.Enum.RolUsuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idUsuario;

  @Column(nullable = false)
  private String nombre;

  @Column(nullable = false)
  private String apellidos;

  @Column(nullable = false)
  private String correo;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String telefono;

  @Column(nullable = false)
  private String direccion;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private RolUsuario rol = RolUsuario.ROLE_CLIENTE;

} 