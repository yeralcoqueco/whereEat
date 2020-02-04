package com.dana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "producto", schema = "whereeat")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;
	
	@Column(name = "descripcion", length = 100, nullable = false)
	private String descripcion;
	
	@Column(name = "precio", nullable = false)
	private String precio;
	
	@Column(name = "tipo", nullable = false)
	private String tipo;
	
	@Column(name = "estado", length = 100, nullable = false)
	private String estado;
	
	@Column(name = "empresa_id" , nullable = false)
	private Integer empresaId;
	
	@Column(name = "empresa_usuario_id" , nullable = false)
	private Integer empresaUsuarioId;
	
	
	
	

}
