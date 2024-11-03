package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ciudad {
    private Long idCiudad;
    private Long idDepartamento;
    private String nombre;
}
