package com.example.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Cliente;
import com.example.demo.Service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
  private final ClienteService clienteService;

  @GetMapping
  public List<Cliente> listarClientes() {
    return clienteService.listarClientes();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Long id) {
    return clienteService.obtenerClientePorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public Cliente crearCliente(@RequestBody Cliente cliente) {
    return clienteService.crearCliente(cliente);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
    try {
      Cliente actualizado = clienteService.actualizarCliente(id, cliente);
      return ResponseEntity.ok(actualizado);
    } catch (RuntimeException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> eliminarCliente(@PathVariable Long id) {
    clienteService.eliminarCliente(id);
    return ResponseEntity.noContent().build();
  }
}
