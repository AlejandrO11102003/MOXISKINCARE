package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Cliente;
import com.example.demo.Enum.EstadoCliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

  List<Cliente> findByEstado(EstadoCliente estado);

}
