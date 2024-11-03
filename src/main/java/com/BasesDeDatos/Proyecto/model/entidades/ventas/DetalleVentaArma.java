package com.BasesDeDatos.Proyecto.model.entidades.ventas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVentaArma {
    private Long idDetalleVentaArma;
    private Long idVenta;
    private Long idArma;
    private Integer cantidad;
    private Double precioUnitario;
}