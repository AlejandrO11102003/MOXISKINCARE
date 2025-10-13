package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}