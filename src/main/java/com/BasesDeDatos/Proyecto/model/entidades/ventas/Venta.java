package com.BasesDeDatos.Proyecto.model.entidades.ventas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    private Long idVenta;           // Identificador único de la venta
    private Long idVendedor;        // Identificador del vendedor que realizó la venta
    private Long idEstadoVenta;     // Identificador del estado de la venta
    private Date fecha;             // Fecha en que se realizó la venta
}