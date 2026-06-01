package com.generation.pi_delivery_alimentos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.pi_delivery_alimentos.model.Usuario;


public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

	 public List<Usuario> findAllByNomeContainingIgnoreCase(String nome); 
	 
	 Optional<Usuario> findByUsuario(String usuario);
	 
	 
}
