package com.BasesDeDatos.Proyecto.model.entidades.producto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sistema_de_propulcion")
public class SistemaDePropulcion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sistema_de_propulcion_seq")
    @SequenceGenerator(name = "sistema_de_propulcion_seq", sequenceName = "SISTEMA_DE_PROPULCION_SEQ", allocationSize = 1)
    private Integer idSistemaDePropulcion;

    private String tipoDeSistema ;
    private String precision ;
    private String eficiencia ;
    private String marca ;
}