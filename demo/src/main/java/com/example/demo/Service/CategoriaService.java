package com.example.Service;

import java.util.List;

import com.example.demo.Entity.Categoria;
public interface CategoriaService {

  List<Categoria> listar();

  Categoria buscarPorId(Long idCategoria);

  Categoria guardar(Categoria categoria);

  void eliminar(Long idCategoria);
}
