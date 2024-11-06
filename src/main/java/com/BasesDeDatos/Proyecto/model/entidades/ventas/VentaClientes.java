package com.BasesDeDatos.Proyecto.model.entidades.ventas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VentaClientes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venta_clientes_seq")
    @SequenceGenerator(name = "venta_clientes_seq", sequenceName = "VENTA_CLIENTES_SEQ", allocationSize = 1)
    private Integer idVentaClientes;

    private Integer idDetalleVentaMunicion;
    private Integer idDetalleVentaArma;
    private Date fechaVenta;
}