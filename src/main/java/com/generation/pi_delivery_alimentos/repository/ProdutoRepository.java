package com.generation.pi_delivery_alimentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.pi_delivery_alimentos.model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

    public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);

}