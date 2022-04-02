package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.Usuario;
import com.example.demo.repositorios.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public void crearUsuario(Usuario usuario) {
		// insert into usuario ...
		usuarioRepository.save(usuario);
	}

	public List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
		return usuarios;
	}

}
