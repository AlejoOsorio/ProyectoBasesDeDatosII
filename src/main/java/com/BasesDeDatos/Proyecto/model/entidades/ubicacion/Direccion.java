package com.BasesDeDatos.Proyecto.model.entidades.ubicacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "direccion_seq")
    @SequenceGenerator(name = "direccion_seq", sequenceName = "DIRECCION_SEQ", allocationSize = 1)
    private Integer idDireccion;

    private Integer idTipoDeDireccion;
    private Integer idVendedor;
    private Integer idCiudad;
    private String direccionCompleta; // Cambié el nombre para evitar confusiones con la palabra "direccion"
}