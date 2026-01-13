package com.example.matricula.modelo.entidad;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "empresa")
    private List<Producto> productos;

    @OneToMany(mappedBy = "empresa")
    private List<Comentario> comentarios;
}