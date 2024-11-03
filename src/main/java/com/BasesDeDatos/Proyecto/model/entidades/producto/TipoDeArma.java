package com.BasesDeDatos.Proyecto.model.entidades.producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase TipoDeArma
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoDeArma {
    private Long idTipoDeArma ;
    private String categoria ;
    private Double longitudDelCanon ;
    private Double calibreDelProyectil ;
}