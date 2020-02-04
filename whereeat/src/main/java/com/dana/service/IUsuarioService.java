package com.dana.service;

import java.util.List;
import java.util.Optional;

import com.dana.model.Usuario;

public interface IUsuarioService {
	
	void guardar(Usuario entity);
	
	void eliminar(Integer id);

	List<Usuario> buscarTodo();

	Optional<Usuario> buscarporId(Integer id);

	
}
