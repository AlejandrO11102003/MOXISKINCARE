package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
 
}
