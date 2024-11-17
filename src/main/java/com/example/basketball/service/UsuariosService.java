package com.example.basketball.service;

import com.example.basketball.model.Usuarios;
import com.example.basketball.repositoy.IUsuariosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuariosService {

	private final IUsuariosRepository usuariosRepository;

	public Optional<Usuarios> usuariosId(String userId) {
		return usuariosRepository.findById(userId);
	}

	public List<Usuarios> usuariosList() {
		return usuariosRepository.findAll();
	}

	public Usuarios crearUsuario(Usuarios usuario) {
		usuario.setFechaHoraCreacion(String.valueOf(new Date()));
		usuario.setFechaHoraAcualizacion(String.valueOf(new Date()));
		return usuariosRepository.save(usuario);
	}
	public Usuarios actualizarUsuario(String id, Usuarios usuarioActualizado) {
		return usuariosRepository.findById(id).map(usuario -> {
			usuario.setNombre(usuarioActualizado.getNombre());
			usuario.setApellido(usuarioActualizado.getApellido());
			usuario.setEmail(usuarioActualizado.getEmail());
			usuario.setEstado(usuarioActualizado.getEstado());
			usuario.setUsuarioActulizacion(usuarioActualizado.getUsuarioActulizacion());
			usuario.setFechaHoraAcualizacion(String.valueOf(new Date()));
			return usuariosRepository.save(usuario);
		}).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
	}
	public Optional<Usuarios> eliminarUsuario(String id) {
		usuariosRepository.deleteById(id);
		return null;
	}

}