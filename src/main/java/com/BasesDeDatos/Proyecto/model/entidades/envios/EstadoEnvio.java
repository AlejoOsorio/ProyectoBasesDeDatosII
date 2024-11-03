package com.BasesDeDatos.Proyecto.model.entidades.envios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoEnvio {
    private Long idEstadoEnvio;
    private String estadoActual;
    private Long numeroSeguimiento;
    private Date fechaEstimadaDeEntrega;
}