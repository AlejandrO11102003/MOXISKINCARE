package com.example.demo.Entity;

import com.example.demo.Enum.EstadoCliente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long idCliente;
  private String nombre;
  private String apellidos;
  private String correo;
  private String telefono;
  private String direccion;
  private String password;
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private EstadoCliente estado;
}
