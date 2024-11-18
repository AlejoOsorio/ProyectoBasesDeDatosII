package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase ComisionVentas
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComisionVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comision_ventas_seq")
    @SequenceGenerator(name = "comision_ventas_seq", sequenceName = "COMISION_VENTAS_SEQ", allocationSize = 1)
    private Integer idComisionVentas;


    private Integer porcentajeComision;
    private Integer nivelArbol;
}
