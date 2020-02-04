package com.dana.service;

import java.util.List;
import java.util.Optional;

import com.dana.model.Producto;

public interface IProductoService {

void guardar(Producto entity);
	
	void eliminar(Integer id);

	List<Producto> buscarTodo();

	Optional<Producto> buscarporId(Integer id);
}
