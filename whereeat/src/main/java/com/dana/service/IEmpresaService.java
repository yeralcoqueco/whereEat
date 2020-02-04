package com.dana.service;

import java.util.List;
import java.util.Optional;

import com.dana.model.Empresa;

public interface IEmpresaService {

	void guardar(Empresa entity);

	void eliminar(Integer id);

	List<Empresa> buscarTodo();

	Optional<Empresa> buscarporId(Integer id);

}
