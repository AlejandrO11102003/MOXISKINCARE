package com.example.demo.Service.Implementacion;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Service.CategoriaService;
import com.example.demo.Entity.Categoria;
import com.example.demo.Repository.CategoriaRepository;

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