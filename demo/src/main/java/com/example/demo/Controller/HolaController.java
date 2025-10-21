package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

  @GetMapping("/usuarios")
  public String adminRoutes() {
    return "layout";
  }

  @GetMapping("/login")
  public String cargarPaginaLogin() {
    return "login";
  }
  
  @GetMapping("/categorias")
  public String adminRoutesCategorias() {
    return "layout";
  }

  @GetMapping("/fragments/usuarios")
  public String getUsuariosFragment() {
     return "usuarios :: contenido";
    }

  @GetMapping("/fragments/categorias")
  public String getCategoriasFragment() {
    return "categorias :: contenido";
  }
}