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
@Table(name = "empresa", schema = "where_eat")

public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", length = 45, nullable = true)
	private String nombre;
	
	@Column(name = "nit", length = 45, nullable = false)
	private String nit;
	
	@Column(name = "direccion", length = 45, nullable = false)
	private String direccion;
	
	@Column(name = "razon_social", length = 45, nullable = true)
	private String razonSocial;
	
	@Column(name = "imagen_perfil", length = 200, nullable = true)
	private String imgPerfil;
	
	@Column(name = "imagen_portada", length = 45, nullable = true)
	private String imgPortada;
	
	@Column(name = "usuario_id" , nullable = false)
	private Integer usuarioId;
	
	@Column(name = "estado", length = 100, nullable = false)
	private String estado;
	

}
