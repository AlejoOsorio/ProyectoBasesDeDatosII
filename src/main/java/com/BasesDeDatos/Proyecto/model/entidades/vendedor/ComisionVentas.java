package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase ComisionVentas
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComisionVentas {
    private Long idComisionVentas;
    private Double porcentajeComision;
    private Integer nivelArbol;
}
