package com.example.demo.Service.Implementacion;

import com.example.demo.Entity.Producto;
import com.example.demo.Repository.ProductoRepository;
import com.example.demo.Service.ProductoService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class IProductoService implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> listarTodos() {
        return productoRepository.findByEstado(1);
    }

    @Override
    public Optional<Producto> buscarPorId(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto guardar(Producto producto) {
        log.info("metodo guardar producto pro");
        log.info("guardando producto: {}", producto);
        producto.setEstado(1);
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Long id, Producto producto) {
        return productoRepository.findById(id)
                .map(existing -> {
                    existing.setNombre(producto.getNombre());
                    existing.setDescripcion(producto.getDescripcion());
                    existing.setPrecio(producto.getPrecio());
                    existing.setCategoria(producto.getCategoria());
                    existing.setImagen(producto.getImagen());
                    existing.setStock(producto.getStock());
                    return productoRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.findById(id).ifPresent(prod -> {
            prod.setEstado(0);
            productoRepository.save(prod);
        });
    }
}
