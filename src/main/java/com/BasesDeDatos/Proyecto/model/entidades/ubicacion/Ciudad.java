package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciudad_seq")
    @SequenceGenerator(name = "ciudad_seq", sequenceName = "CIUDAD_SEQ", allocationSize = 1)
    private Integer idCiudad;

    private Integer idDepartamento;
    private String nombre;
}
