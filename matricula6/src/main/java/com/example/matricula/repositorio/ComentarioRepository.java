package com.example.matricula.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.matricula.modelo.entidad.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}