package com.hackhathon.Polinize.Hackathon.Polinize.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackhathon.Polinize.Hackathon.Polinize.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);
	
	
}
