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
import com.dana.service.IEmpresaService;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {
	
	@Autowired
	private IEmpresaService service;
	
	@PostMapping
	public void guardar( @RequestBody Empresa entity) {
		service.guardar(entity);	
	}
	
	@DeleteMapping(path = "{id}")
	public void eliminar(Integer id) {
		service.eliminar(id);
	}

	@GetMapping(path = "buscar-todo")
	public List<Empresa> buscarTodo() {

		return service.buscarTodo();
	}

	@GetMapping(path = "buscar/{id}")
	public ResponseEntity<?> buscarporId(@PathVariable Integer id) {

		Optional<Empresa> empresa = service.buscarporId(id);

		if (empresa.isPresent()) {
			return new ResponseEntity<>(empresa.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
