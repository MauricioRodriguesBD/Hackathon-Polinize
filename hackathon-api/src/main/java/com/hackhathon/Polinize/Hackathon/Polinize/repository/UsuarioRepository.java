package com.hackhathon.Polinize.Hackathon.Polinize.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackhathon.Polinize.Hackathon.Polinize.model.Usuario;
/*Repositório que será controlado em UsuárioController
 * 
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	/*Busca por algum dado dentro da tabela usuario podendo ser tanto
	 * letras maiúsculas como minúsculas
	 */
	public Optional<Usuario> findByUsuario(String usuario);
	
	
}
