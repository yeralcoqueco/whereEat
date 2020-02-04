package com.dana.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dana.model.Usuario;
import com.dana.repository.IUsuarioRepository;
import com.dana.service.IUsuarioService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Override
	public void guardar(Usuario entity) {
		
		/*String pass = bcrypt.encode(entity.getClave());
		entity.setClave(pass);*/
		
		entity.setClave(bcrypt.encode(entity.getClave()));
		
		repo.save(entity);	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Usuario> buscarTodo() {
		return repo.findAll();
	}

	@Override
	public Optional<Usuario> buscarporId(Integer id) {
		return repo.findById(id);
	}
}
