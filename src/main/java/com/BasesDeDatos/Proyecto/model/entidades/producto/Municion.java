package com.BasesDeDatos.Proyecto.model.entidades.producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Municion {
    private Long idMunicion;
    private String referencia;
    private String material;
    private String tamanio;
    private Double peso;
}
