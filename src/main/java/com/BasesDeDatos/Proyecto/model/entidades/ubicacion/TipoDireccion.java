package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase TipoDireccion
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipo_de_direccion")
public class TipoDireccion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_direccion_seq")
    @SequenceGenerator(name = "tipo_direccion_seq", sequenceName = "TIPO_DIRECCION_SEQ", allocationSize = 1)
    private Integer idTipoDeDireccion;

    private String descripcion ;
}

