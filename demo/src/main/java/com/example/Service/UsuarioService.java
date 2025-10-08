package com.example.Service;

import com.example.demo.Entity.Usuario;
import java.util.List;

public interface UsuarioService {
    
    List<Usuario> listar();

    Usuario buscarPorId(Long id);

    Usuario guardar(Usuario usuario);

    void eliminar(Long id);

    Usuario buscarPorCorreo(String correo);

}
