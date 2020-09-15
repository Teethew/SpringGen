package com.generation.minhaRedeSocial.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhaRedeSocial.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario (String usuario);
}
