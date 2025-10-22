package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Usuario;
import com.example.demo.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

  //inyeccion para tests      
  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping
  public List<Usuario> getAllUsuarios() {
    return usuarioRepository.findAll();
  }

  @GetMapping("/{id}")
  public Usuario getUsuarioById(@PathVariable Long id) {
    return usuarioRepository.findById(id).orElse(null);
  }

  @PostMapping
  public Usuario createUsuario(@RequestBody Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  @PutMapping("/{id}")
  public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
    usuario.setIdUsuario(id);
    return usuarioRepository.save(usuario);
  }

  @DeleteMapping("/{id}")
  public void deleteUsuario(@PathVariable Long id) {
    usuarioRepository.deleteById(id);
  }
}
