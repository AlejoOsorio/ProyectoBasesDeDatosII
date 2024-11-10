package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "administrador_seq")
    @SequenceGenerator(name = "administrador_seq", sequenceName = "ADMINISTRADOR_SEQ", allocationSize = 1)
    private Integer idAdministrador;

    private String nombre;
    private String telefono;
    private String correo;
    private Integer idCuenta;
}
