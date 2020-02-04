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
@Table(name = "usuario", schema = "whereeat")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombres", length = 100, nullable = false)
	private String nombres;
	
	@Column(name = "apellidos", length = 100, nullable = false)
	private String apellidos;
	
	@Column(name = "identificacion", length = 100, nullable = false)
	private String identificacion;
	
	@Column(name = "correo", length = 100, nullable = false)
	private String correo;
	
	@Column(name = "clave", length = 100, nullable = false)
	private String clave;
	
	@Column(name = "celular", length = 100, nullable = false)
	private String celular;
	
	@Column(name = "estado", length = 100, nullable = false)
	private String estado;
	
	@Column(name = "rol_id" , nullable = false)
	private Integer rolId;
}