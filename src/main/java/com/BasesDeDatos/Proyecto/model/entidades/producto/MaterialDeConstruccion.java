package com.BasesDeDatos.Proyecto.model.entidades.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MaterialDeConstruccion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "material_construccion_seq")
    @SequenceGenerator(name = "material_construccion_seq", sequenceName = "MATERIAL_CONSTRUCCION_SEQ", allocationSize = 1)
    private Integer idMaterialDeConstruccion;

    private String tipoDeMaterial;
    private Double pesoTotal;
    private String resistencia;
}