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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "materia_construccion_seq")
    @SequenceGenerator(name = "materia_construccion_seq", sequenceName = "MATERIA_CONSTRUCCION_SEQ", allocationSize = 1)
    private Integer idMateriaDeConstruccion;

    private String tipoDeMaterial;
    private Integer pesoTotal;
    private String resistencia;
}