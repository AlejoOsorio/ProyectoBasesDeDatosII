package com.BasesDeDatos.Proyecto.model.entidades.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Municion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "municion_seq")
    @SequenceGenerator(name = "municion_seq", sequenceName = "MUNICION_SEQ", allocationSize = 1)
    private Integer idMunicion;

    private String referencia;
    private String material;
    private String tamanio;
    private Double peso;
    private Double precio;

}
