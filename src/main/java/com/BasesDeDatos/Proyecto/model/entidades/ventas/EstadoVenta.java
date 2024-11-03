package com.BasesDeDatos.Proyecto.model.entidades.ventas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoVenta {
    private Long idEstadoVenta;
    private String descripcion;
}
