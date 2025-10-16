package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

    @GetMapping("/hola")
    public String cargarpaginaUsuarios() {
        return "usuarios";
    }

    @GetMapping("/index")
    public String CargarIndex() {
        return "index";
    }
}