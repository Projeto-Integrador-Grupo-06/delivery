package com.generation.pi_delivery_alimentos.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_Usuairios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // gera IDs automaticamente
	private Long id;

	@NotBlank(message = "O atributo nome é Obrigatório!") //
	@Size(max = 100, message = "Informe seu Nome: ")
	private String nome;

	// E-MAIL
	@NotBlank(message = "O atributo E-mail é obrigatório!")
	@Size(min = 10, max = 255)
	@Email(message = "Informe seu E-mail.")
	private String usuario;

	// SENHA
	@NotBlank(message = "O atributo Senha é obrigatório!")
	@Size(min = 8, max = 255, message = "Crie uma senha forte!")
	private String senha;

	// FOTO
	@Size(max = 5000, message = "O link da foto não pode ser maior 5000 caracteres.")
	private String foto;
	
	@NotBlank(message = "O atributo endereço é Obrigatório!") //
	@Size( max = 250, message = "Informe seu Endereço: ")
	private String endereco;
	
	
	
	
	//GET E SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	
	

}
