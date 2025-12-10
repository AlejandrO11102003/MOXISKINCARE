package com.example.demo.Service.Implementacion;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Usuario;
import com.example.demo.Repository.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  private static final Logger LOG = LoggerFactory.getLogger(CustomUserDetailsService.class);

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Override
  public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
    LOG.info("Intentando autenticar al usuario con correo: {}", correo);

    Usuario usuario = usuarioRepository.findByCorreo(correo)
        .orElseThrow(() -> {
          LOG.warn("Usuario no encontrado con correo: {}", correo);
          return new UsernameNotFoundException("Usuario no encontrado con correo: " + correo);
        });

    LOG.info("Usuario encontrado: {}. Procediendo con la autenticación.", usuario.getCorreo());
    return new com.example.demo.Security.CustomUserDetails(
        usuario.getCorreo(),
        usuario.getPassword(),
        Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")),
        usuario.getNombre());
  }
}
