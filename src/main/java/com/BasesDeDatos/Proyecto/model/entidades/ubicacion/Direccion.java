package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {
    private Long idDireccion;
    private Long idTipoDeDireccion;
    private Long idVendedor;
    private Long idCiudad;
    private String direccionCompleta; // Cambié el nombre para evitar confusiones con la palabra "direccion"
}