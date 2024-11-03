package com.BasesDeDatos.Proyecto.model.entidades.ventas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaClientes {
    private Long idVentaClientes;          // Identificador único de la venta a clientes
    private Long idDetalleVentaMunicion;   // Identificador del detalle de venta de munición
    private Long idDetalleVentaArma;       // Identificador del detalle de venta de arma
    private Date fechaVenta;                // Fecha en que se realizó la venta a clientes
}