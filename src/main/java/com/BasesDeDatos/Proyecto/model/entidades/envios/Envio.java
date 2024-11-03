package com.BasesDeDatos.Proyecto.model.entidades.envios;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Envio {

    private Long idEnvio;

    private Long idEstadoEnvio;
    private Long idVendedor;
    private Date fechaEnvio;
    private Date fechaRecibido;
}
