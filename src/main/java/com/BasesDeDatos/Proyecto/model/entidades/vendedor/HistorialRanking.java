package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialRanking {
    private long idHistorialRanking;
    private long idRanking;
    private long idVendedor;
    private Date fechaInicio;
    private Date fechaFin;
}
