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
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "envio_seq")
    @SequenceGenerator(name = "envio_seq", sequenceName = "ENVIO_SEQ", allocationSize = 1)
    private Integer idEnvio;

    private Integer idEstadoEnvio;
    private Integer idVendedor;
    private Date fechaEnvio;
    private Date fechaRecibido;
}
