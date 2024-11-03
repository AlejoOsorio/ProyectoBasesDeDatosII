package com.BasesDeDatos.Proyecto.model.entidades.producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arma {
    private Long idArma;
    private Long idModoDeDisparo;
    private Long idMaterialDeConstruccion;
    private Long idTipoDeArma;
    private Long idSistemaDePropulsion;
    private Long idDisenoEstampado;
    private String nombre;
    private String modelo;
    private Double capacidadDelCargador;
    private Double peso;
    private Double dimension;
    private String presion;
}