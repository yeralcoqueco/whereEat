package com.dana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dana.model.Empresa;

public interface IEmpresaRepository extends JpaRepository<Empresa, Integer> {

}
