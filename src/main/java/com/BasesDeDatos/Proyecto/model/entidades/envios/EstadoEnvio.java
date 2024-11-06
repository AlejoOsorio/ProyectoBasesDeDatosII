package com.BasesDeDatos.Proyecto.model.entidades.envios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EstadoEnvio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_envio_seq")
    @SequenceGenerator(name = "estado_envio_seq", sequenceName = "ESTADO_ENVIO_SEQ", allocationSize = 1)
    private Integer idEstadoEnvio;


    private String estadoActual;
    private Integer numeroSeguimiento;
    private Date fechaEstimadaDeEntrega;
}