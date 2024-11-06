package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InventarioMunicion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventario_municion_seq")
    @SequenceGenerator(name = "inventario_municion_seq", sequenceName = "INVENTARIO_MUNICION_SEQ", allocationSize = 1)
    private Long idInventarioMunicion;

    private Long idMunicion;
    private Long idVendedor;
    private Integer cantidad;
}