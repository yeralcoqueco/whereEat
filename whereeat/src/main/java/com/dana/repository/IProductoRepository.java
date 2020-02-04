package com.dana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dana.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
