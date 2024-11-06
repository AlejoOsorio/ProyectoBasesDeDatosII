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
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venta_seq")
    @SequenceGenerator(name = "venta_seq", sequenceName = "VENTA_SEQ", allocationSize = 1)
    private Integer idVenta;

    private Integer idVendedor;
    private Integer idEstadoVenta;
    private Date fecha;
}