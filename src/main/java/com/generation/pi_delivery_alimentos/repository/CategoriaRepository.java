package com.generation.pi_delivery_alimentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.pi_delivery_alimentos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	// Busca só as categorias veganas
    List<Categoria> findAllByCategoriaVegano(Boolean categoriaVegano);
}
