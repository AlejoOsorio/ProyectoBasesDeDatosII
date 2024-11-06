package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HistorialRanking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "historial_ranking_seq")
    @SequenceGenerator(name = "historial_ranking_seq", sequenceName = "HISTORIAL_RANKING_SEQ", allocationSize = 1)
    private Integer idHistorialRanking;

    private Integer idRanking;
    private Integer idVendedor;
    private Date fechaInicio;
    private Date fechaFin;
}
