package com.hackhathon.Polinize.Hackathon.Polinize.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hackhathon.Polinize.Hackathon.Polinize.model.Usuario;
import com.hackhathon.Polinize.Hackathon.Polinize.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(() ->  new UsernameNotFoundException(userName + " Não encontrado."));
		
		return user.map(UserDetailsImp::new).get();
		
	}
	

}
