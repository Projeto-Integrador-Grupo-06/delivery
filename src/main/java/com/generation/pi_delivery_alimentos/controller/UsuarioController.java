package com.generation.pi_delivery_alimentos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.pi_delivery_alimentos.model.Usuario;
import com.generation.pi_delivery_alimentos.repository.UsuarioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios") // Define a rota principal da API. //Exemplo: localhost:8080/usuario
@CrossOrigin(origins = "*", allowedHeaders = "*") //
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public ResponseEntity<List<Usuario>> getAll() {
		return ResponseEntity.ok(usuarioRepository.findAll());
	}

	// Listar por Id

	@GetMapping("/{id}") //
	public ResponseEntity<Usuario> getById(@PathVariable Long id) {
		return usuarioRepository.findById(id) // métodos de manipulação de dados no sql

				// .map metodo lambda
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());

	}

	// Listagem por nome
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Usuario>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(usuarioRepository.findAllByNomeContainingIgnoreCase(nome));

	}

	// INSERT do SQL (criar/inserir dados)
	@PostMapping
	public ResponseEntity<Usuario> post(@Valid @RequestBody Usuario usuario) {

		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isEmpty()) {

			usuario.setId(null);

			return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
		}

		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já cadastrado!");
	}

	// Atualizar
	@PutMapping
	public ResponseEntity<Usuario> put(@Valid @RequestBody Usuario usuario) {

		if (usuarioRepository.existsById(usuario.getId())) {

			return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	// Deletar
	// Representa o DELETE do SQL (remover dados)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Usuario> produto = usuarioRepository.findById(id);
		// Se o id não existir, retorna erro 404
		if (produto.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);

		usuarioRepository.deleteById(id);

	}

}
