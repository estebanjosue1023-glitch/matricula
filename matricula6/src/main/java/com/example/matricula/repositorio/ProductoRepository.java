package com.example.matricula.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.matricula.modelo.entidad.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}