package com.example.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
    List<Producto> findByEstado(Integer estado);
}