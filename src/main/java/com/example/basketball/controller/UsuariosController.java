package com.example.basketball.controller;

import com.example.basketball.model.Usuarios;
import com.example.basketball.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UsuariosController {

	@Autowired
	private UsuariosService usuariosService;

	@GetMapping("/obtenerid/{id}")
	public Optional<Usuarios> obtenerId(@PathVariable String id) {
		return usuariosService.usuariosId(id);
	}

	@GetMapping("/obtenerUsuarios")
	public List<Usuarios> obtenerUsuarios() {
		return usuariosService.usuariosList();
	}

	@PostMapping("/crearUsuarios")
	public Usuarios crearUsuario(@RequestBody Usuarios usuario) {
		return usuariosService.crearUsuario(usuario);
	}

	@PutMapping("/actualizarUsuarios/{id}")
	public Usuarios actualizarUsuario(@PathVariable String id, @RequestBody Usuarios usuario) {
		return usuariosService.actualizarUsuario(id, usuario);
	}

	@DeleteMapping("/eliminarUsuarios/{id}")
	public void eliminarUsuario(@PathVariable String id) {
		usuariosService.eliminarUsuario(id);
	}
}