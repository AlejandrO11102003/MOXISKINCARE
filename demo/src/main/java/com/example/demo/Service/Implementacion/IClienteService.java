package com.example.demo.Service.Implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cliente;
import com.example.demo.Enum.EstadoCliente;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Service.ClienteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class IClienteService implements ClienteService {
  private final ClienteRepository clienteRepository;

  public List<Cliente> listarClientes() {
    return clienteRepository.findAll();
  }

  @Override
  public List<Cliente> obtenerClientesPorEstado(EstadoCliente estado) {
    return clienteRepository.findByEstado(estado);
  }

  @Override
  public Cliente crearCliente(Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  @Override
  public Cliente actualizarCliente(Long id, Cliente cliente) {
    Cliente clienteExistente = clienteRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + id));
    clienteExistente.setNombre(cliente.getNombre());
    clienteExistente.setCorreo(cliente.getCorreo());
    clienteExistente.setEstado(cliente.getEstado());
    clienteExistente.setTelefono(cliente.getTelefono());
    clienteExistente.setDireccion(cliente.getDireccion());
    clienteExistente.setApellidos(cliente.getApellidos());
    clienteExistente.setPassword(cliente.getPassword());
    return clienteRepository.save(clienteExistente);
  }

  @Override
  public void eliminarCliente(Long id) {
    clienteRepository.deleteById(id);
  }

  @Override
  public Optional<Cliente> obtenerClientePorId(Long id) {
    return clienteRepository.findById(id);
  }
}
