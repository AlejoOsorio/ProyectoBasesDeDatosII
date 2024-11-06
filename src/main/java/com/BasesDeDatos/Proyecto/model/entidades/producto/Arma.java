package com.BasesDeDatos.Proyecto.model.entidades.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "arma_seq")
    @SequenceGenerator(name = "arma_seq", sequenceName = "ARMA_SEQ", allocationSize = 1)
    private Integer idArma;

    private Integer idModoDeDisparo;
    private Integer idMaterialDeConstruccion;
    private Integer idTipoDeArma;
    private Integer idSistemaDePropulsion;
    private Integer idDisenoEstampado;
    private String nombre;
    private String modelo;
    private Double capacidadDelCargador;
    private Double peso;
    private Double dimension;
    private String presion;
}