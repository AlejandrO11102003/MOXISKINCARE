package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CategoriaService;
import com.example.demo.Entity.Categoria;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categorias")
@RequiredArgsConstructor

public class CategoriaController {
  private final CategoriaService categoriaService;

  @GetMapping
  public List<Categoria> listarcategorias() {
    return categoriaService.listar();
  }

  @GetMapping("/{id}")
  public Categoria getCategoriaById(@PathVariable Long id) {
    return categoriaService.buscarPorId(id);
  }

  @PostMapping
  public Categoria createCategoria(@RequestBody Categoria categoria) {
    return categoriaService.guardar(categoria);
  }

  @PutMapping("/{id}")
  public Categoria updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
    categoria.setIdCategoria(id);
    return categoriaService.guardar(categoria);
  }

  @DeleteMapping("/{id}")
  public void deleteCategoria(@PathVariable Long id) {
    categoriaService.eliminar(id);
  }

}
