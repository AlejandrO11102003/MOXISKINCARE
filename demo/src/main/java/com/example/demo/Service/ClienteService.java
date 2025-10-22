package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Cliente;
import com.example.demo.Enum.EstadoCliente;

public interface ClienteService {

  List<Cliente> obtenerClientesPorEstado(EstadoCliente estado);

  Cliente crearCliente(Cliente cliente);

  Cliente actualizarCliente(Long id, Cliente cliente);

  void eliminarCliente(Long id);

  List<Cliente> listarClientes();

  Optional<Cliente> obtenerClientePorId(Long id);

}
