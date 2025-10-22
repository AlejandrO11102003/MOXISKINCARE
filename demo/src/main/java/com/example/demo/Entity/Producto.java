package com.example.demo.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    private String nombre;

    private String descripcion;

    private Double precio;

    private String imagen;

    private Integer stock;

    @Column(nullable = false)
    private Integer estado = 1;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}
