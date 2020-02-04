package com.dana.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dana.model.Empresa;
import com.dana.repository.IEmpresaRepository;
import com.dana.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private IEmpresaRepository repo;
	
	@Override
	public void guardar(Empresa entity) {
		repo.save(entity);
	}

	@Override
	public void eliminar(Integer id) {	
		repo.deleteById(id);
	}

	@Override
	public List<Empresa> buscarTodo() {
		return repo.findAll();
	}

	@Override
	public Optional<Empresa> buscarporId(Integer id) {
		return repo.findById(id);
	}
	

}
