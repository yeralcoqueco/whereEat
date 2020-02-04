package com.dana.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dana.model.Empresa;
import com.dana.model.Usuario;
import com.dana.service.IUsuarioService;

@RestController
@RequestMapping("api/registro")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@PostMapping
	public void guardar(@RequestBody Usuario entity) {
		service.guardar(entity);
	}
	
	
	@DeleteMapping(path = "{id}")
	public void eliminar(Integer id) {
		service.eliminar(id);
	}

	@GetMapping(path = "buscar-todo")
	public List<Usuario> buscarTodo() {

		return service.buscarTodo();
	}

	@GetMapping(path = "buscar/{id}")
	public ResponseEntity<?> buscarporId(@PathVariable Integer id) {

		Optional<Usuario> usuario = service.buscarporId(id);

		if (usuario.isPresent()) {
			return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
