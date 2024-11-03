package com.BasesDeDatos.Proyecto.model.entidades.producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisenoEstampado {
    private Long idDisenoEstampado;
    private Long idColorPrimario;
    private Long idColorSecundario;
    private String nombre;
    private String tipoDePatron;
}
