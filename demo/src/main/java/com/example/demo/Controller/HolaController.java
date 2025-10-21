package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

  // Todas las rutas de admin sirven la misma plantilla layout.
  // El JS se encargará de cargar el contenido correcto.
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

  // Nuevos endpoints para servir solo los fragmentos de HTML
  @GetMapping("/fragments/usuarios")
  public String getUsuariosFragment() { return "usuarios :: contenido"; }

  @GetMapping("/fragments/categorias")
  public String getCategoriasFragment() { return "categorias :: contenido"; }
}