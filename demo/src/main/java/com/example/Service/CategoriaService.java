package com.example.Service;

import com.example.demo.Entity.Categoria;
import java.util.List;
public interface CategoriaService {

  List<Categoria> listar();

  Categoria buscarPorId(Long id);

  Categoria guardar(Categoria categoria);

  void eliminar(Long id);
}
