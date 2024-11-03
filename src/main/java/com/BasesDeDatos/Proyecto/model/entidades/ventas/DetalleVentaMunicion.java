package com.BasesDeDatos.Proyecto.model.entidades.ventas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVentaMunicion {
    private Long idDetalleVentaMunicion;
    private Long idVenta;
    private Long idMunicion;
    private Integer cantidad;
    private Double precioUnitario;
}