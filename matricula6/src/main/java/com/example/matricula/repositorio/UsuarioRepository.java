package com.example.matricula.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.matricula.modelo.entidad.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}