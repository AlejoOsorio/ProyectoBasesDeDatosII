package com.BasesDeDatos.Proyecto.model.entidades.producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SistemaDePropulsion {
    private Long idSistemaDePropulsion ;
    private String tipoDeSistema ;
    private String precision ;
    private String eficiencia ;
    private String marca ;
}