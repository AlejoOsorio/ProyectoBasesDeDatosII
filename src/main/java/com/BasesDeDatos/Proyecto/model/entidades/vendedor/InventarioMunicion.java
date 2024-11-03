package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventarioMunicion {
    private Long idInventarioMunicion;
    private Long idMunicion;
    private Long idVendedor;
    private Integer cantidad;
}