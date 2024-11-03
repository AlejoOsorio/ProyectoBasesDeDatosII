package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoComisiones {
    private Long idPagoComisiones;
    private Long idVendedorRecibe;
    private Long idVendedorPago;
    private Date fecha;
    private Double valorComision;
}
