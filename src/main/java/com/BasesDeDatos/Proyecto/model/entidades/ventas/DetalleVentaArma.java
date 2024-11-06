package com.BasesDeDatos.Proyecto.model.entidades.ventas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetalleVentaArma {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_venta_arma_seq")
    @SequenceGenerator(name = "detalle_venta_arma_seq", sequenceName = "DETALLE_VENTA_ARMA_SEQ", allocationSize = 1)
    private Integer idDetalleVentaArma;

    private Integer idVenta;
    private Integer idArma;
    private Integer cantidad;
    private Double precioUnitario;
}