package com.example.matricula.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.matricula.modelo.entidad.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}