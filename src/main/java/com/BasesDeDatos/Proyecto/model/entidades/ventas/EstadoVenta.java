package com.BasesDeDatos.Proyecto.model.entidades.ventas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EstadoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_venta_seq")
    @SequenceGenerator(name = "estado_venta_seq", sequenceName = "ESTADO_VENTA_SEQ", allocationSize = 1)
    private Integer idEstadoVenta;

    private String descripcion;
}
