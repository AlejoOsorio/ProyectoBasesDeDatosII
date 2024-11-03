package com.BasesDeDatos.Proyecto.model.entidades.producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialDeConstruccion {
    private Long idMaterialDeConstruccion;
    private String tipoDeMaterial;
    private Double pesoTotal;
    private String resistencia;
}