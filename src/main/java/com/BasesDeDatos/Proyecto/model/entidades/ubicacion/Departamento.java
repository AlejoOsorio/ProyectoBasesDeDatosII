package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase Departamento
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {
    private Long idDepartamento;
    private String nombre;
}