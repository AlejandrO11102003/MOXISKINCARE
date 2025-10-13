package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Categoria;
import com.example.Service.Implementacion.ICategoriaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categorias")
@RequiredArgsConstructor

public class CategoriaController {
  
  private final ICategoriaService iCategoriaService;

  @GetMapping
  public List<Categoria> listarcategorias() {
    return iCategoriaService.listar();
  }

  @GetMapping("/{id}")
  public Categoria getCategoriaById(@PathVariable Long idCategoria) {
    return iCategoriaService.buscarPorId(idCategoria);
  }

  @PostMapping
  public Categoria createCategoria(@RequestBody Categoria categoria) {
    return iCategoriaService.guardar(categoria);
  }

  @PutMapping("/{id}")
  public Categoria updateCategoria(@PathVariable Long idCategoria, @RequestBody Categoria categoria) {
    categoria.setIdCategoria(idCategoria);
    return iCategoriaService.guardar(categoria);
  }

  @DeleteMapping("/{id}")
  public void deleteCategoria(@PathVariable Long idCategoria) {
    iCategoriaService.eliminar(idCategoria);
  }

}
