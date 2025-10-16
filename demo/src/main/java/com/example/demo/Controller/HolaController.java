package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

    @GetMapping("/usuarios")
    public String cargarpaginaUsuarios() {
      return "usuarios";
    }

    @GetMapping("/login")
    public String cargarPaginaLogin() {
      return "login";
    }

    @GetMapping("/index")
    public String CargarIndex() {
        return "index";
    }
}