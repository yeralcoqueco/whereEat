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

import com.dana.model.Producto;
import com.dana.service.IProductoService;


@RestController
@RequestMapping("api/producto")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@PostMapping
	public void guardar( @RequestBody Producto entity) {
		service.guardar(entity);	
	}
	
	@DeleteMapping(path = "{id}")
	public void eliminar(Integer id) {
		service.eliminar(id);
	}

	@GetMapping(path = "buscar-todo")
	public List<Producto> buscarTodo() {

		return service.buscarTodo();
	}

	@GetMapping(path = "buscar/{id}")
	public ResponseEntity<?> buscarporId(@PathVariable Integer id) {

		Optional<Producto> producto = service.buscarporId(id);

		if (producto.isPresent()) {
			return new ResponseEntity<>(producto.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
