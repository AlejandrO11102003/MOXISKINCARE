package com.example.Service.Implementación;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Service.CategoriaService;
import com.example.demo.Entity.Categoria;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ICategoriaService implements CategoriaService {
  private final CategoriaService categoriaService;

  @Override
  public List<Categoria> listar() {
    return categoriaService.listar();
  }

  @Override
  public Categoria buscarPorId(Long id) {
    return categoriaService.buscarPorId(id);
  }

  @Override
  public Categoria guardar(Categoria categoria) {
    return categoriaService.guardar(categoria);
  }

  @Override
  public void eliminar(Long id) {
    categoriaService.eliminar(id);
  }
}
