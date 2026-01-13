package com.example.matricula.modelo.entidad;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombres;
    private String apellidos;
    private String correo;
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Comentario> comentarios;
}