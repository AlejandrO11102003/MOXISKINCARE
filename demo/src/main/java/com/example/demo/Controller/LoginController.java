package com.example.demo.Controller;

import com.example.demo.Entity.Usuario;
import com.example.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public String login(@RequestParam String correo, @RequestParam String password) {
        // buscamos en la BD el usuario por correo y contraseña
        Usuario usuario = usuarioRepository.findByCorreoAndPassword(correo, password);
        if (usuario != null) {
            return "Login exitoso";
        } else {
            return "Credenciales inválidas";
        }
    }
}

