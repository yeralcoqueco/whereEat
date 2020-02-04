package com.dana.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dana.model.Producto;
import com.dana.repository.IProductoRepository;
import com.dana.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository repo;
	
	@Override
	public void guardar(Producto entity) {
		repo.save(entity);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);;
	}

	@Override
	public List<Producto> buscarTodo() {
		return repo.findAll();
	}

	@Override
	public Optional<Producto> buscarporId(Integer id) {
		return repo.findById(id);
	}

	 
	
}
