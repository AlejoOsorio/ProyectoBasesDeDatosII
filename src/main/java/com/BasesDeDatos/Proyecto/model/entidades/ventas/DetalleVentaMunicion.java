package com.BasesDeDatos.Proyecto.model.entidades.ventas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetalleVentaMunicion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_venta_municion_seq")
    @SequenceGenerator(name = "detalle_venta_municion_seq", sequenceName = "DETALLE_VENTA_MUNICION_SEQ", allocationSize = 1)
    private Integer idDetalleVentaMunicion;

    private Integer idVenta;
    private Integer idMunicion;
    private Integer cantidad;
    private Double precioUnitario;
}