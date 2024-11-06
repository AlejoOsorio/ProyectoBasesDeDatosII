package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase Departamento
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departamento_seq")
    @SequenceGenerator(name = "departamento_seq", sequenceName = "DEPARTAMENTO_SEQ", allocationSize = 1)
    private Integer idDepartamento;

    private String nombre;
}