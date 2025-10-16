package com.example.Service.Implementacion;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Categoria;
import com.example.Repository.CategoriaRepository;
import com.example.Service.CategoriaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ICategoriaService implements CategoriaService {

  private final CategoriaRepository categoriaRepository;

  @Override
  public List<Categoria> listar() {
    return categoriaRepository.findAll();
  }

  @Override
  public Categoria buscarPorId(Long idCategoria) {
    return categoriaRepository.findById(idCategoria).orElse(null);
  }

  @Override
  public Categoria guardar(Categoria categoria) {
    return categoriaRepository.save(categoria);
  }

  @Override
  public void eliminar(Long idCategoria) {
    categoriaRepository.deleteById(idCategoria);
  }
}