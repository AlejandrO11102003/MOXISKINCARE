package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long IdUsuario;

  private String Nombre;

  private String Apellidos;

  private String Correo;

  private String Password;

  private String Telefono;

  private String Direccion;

}