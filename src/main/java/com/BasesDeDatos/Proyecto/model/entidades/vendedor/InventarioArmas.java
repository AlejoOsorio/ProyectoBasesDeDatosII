package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventarioArmas {
    private Long idInventarioArmas;
    private Long idArma;
    private Long idVendedor;
    private Integer cantidad;
}