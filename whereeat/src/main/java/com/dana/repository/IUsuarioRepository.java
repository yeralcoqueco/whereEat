package com.dana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dana.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
