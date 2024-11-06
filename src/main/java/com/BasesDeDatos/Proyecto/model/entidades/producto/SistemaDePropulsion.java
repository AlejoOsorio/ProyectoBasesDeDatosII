package com.BasesDeDatos.Proyecto.model.entidades.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SistemaDePropulsion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sistema_propulsion_seq")
    @SequenceGenerator(name = "sistema_propulsion_seq", sequenceName = "SISTEMA_PROPULSION_SEQ", allocationSize = 1)
    private Integer idSistemaDePropulsion;

    private String tipoDeSistema ;
    private String precision ;
    private String eficiencia ;
    private String marca ;
}