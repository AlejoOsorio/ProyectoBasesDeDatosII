package com.BasesDeDatos.Proyecto.model.entidades.producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModoDeDisparo {
    private Long idModoDeDisparo;
    private String tipoDeDisparo;
    private String velocidadDeDisparo;
    private Double intervaloEntreDisparos;
}