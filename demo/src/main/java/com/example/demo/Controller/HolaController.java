package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

  @GetMapping("/login")
  public String cargarPaginaLogin() {
    return "login";
  }

  @GetMapping("/usuarios")
  public String adminRoutes() {
    return "layout";
  }
  
  @GetMapping("/categorias")
  public String adminRoutesCategorias() {
    return "layout";
  }

  @GetMapping("/productos")
  public String adminRoutesProductos() {
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

  @GetMapping("/fragments/productos")
  public String getProductosFragment() {
    return "productos :: contenido";
  }
}