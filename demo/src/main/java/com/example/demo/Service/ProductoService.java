package com.example.demo.Service;

import com.example.demo.Entity.Producto;
import java.util.List;
import java.util.Optional;


public interface ProductoService {

    List<Producto> listarTodos();
    Optional<Producto> buscarPorId(Long id);
    Producto guardar(Producto producto);
    Producto actualizar(Long id, Producto producto);
    void eliminar(Long id);

}
