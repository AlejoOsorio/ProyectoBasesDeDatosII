package com.BasesDeDatos.Proyecto.model.entidades.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase TipoDeArma
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TipoDeArma {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_arma_seq")
    @SequenceGenerator(name = "tipo_arma_seq", sequenceName = "TIPO_ARMA_SEQ", allocationSize = 1)
    private Integer idTipoDeArma;

    private String categoria ;
    private Double longitudDelCanon ;
    private Double calibreDelProyectil ;
}