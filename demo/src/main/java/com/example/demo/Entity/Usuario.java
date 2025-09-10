package com.example.demo.Entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUsuario;

    @NotNull
    private String Nombre;

    @NotNull
    private String Apellidos;

    @NotNull
    private String Correo;

    @NotNull
    private String Password;

    @NotNull
    private String Telefono;

    @NotNull
    private String Direccion;

    
}