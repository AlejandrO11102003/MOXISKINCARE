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

import com.example.demo.Entity.Categoria;
import com.example.demo.Service.Implementacion.ICategoriaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {
  
  private final ICategoriaService iCategoriaService;

  @GetMapping
  public List<Categoria> listarcategorias() {
    return iCategoriaService.listar();
  }

  @GetMapping("/{id}")
  public Categoria getCategoriaById(@PathVariable("id") Long idCategoria) {
    return iCategoriaService.buscarPorId(idCategoria);
  }

  @PostMapping
  public Categoria createCategoria(@RequestBody Categoria categoria) {
    return iCategoriaService.guardar(categoria);
  }

  @PutMapping("/{id}")
  public Categoria updateCategoria(@PathVariable("id") Long idCategoria, @RequestBody Categoria categoria) {
    categoria.setIdCategoria(idCategoria);
    return iCategoriaService.guardar(categoria);
  }

  @DeleteMapping("/{id}")
  public void deleteCategoria(@PathVariable("id") Long idCategoria) {
    iCategoriaService.eliminar(idCategoria);
  }
}
