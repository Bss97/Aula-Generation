package org.generation.minhaLojaDeGames.controller;

import java.util.Optional;

import org.generation.minhaLojaDeGames.model.UserLogin;
import org.generation.minhaLojaDeGames.model.Usuario;
import org.generation.minhaLojaDeGames.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService userService;

	@PostMapping("/login")
	public ResponseEntity<UserLogin> logado(@RequestBody Optional<UserLogin> user) {
		return userService.Login(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Cadastrado(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.CadastrarUsuario(usuario));
	}
}
