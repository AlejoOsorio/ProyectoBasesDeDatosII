package com.BasesDeDatos.Proyecto.model.entidades.producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "promocion_seq")
    @SequenceGenerator(name = "promocion_seq", sequenceName = "PROMOCION_SEQ", allocationSize = 1)
    private Integer idPromocion;

    private Integer idArma;
    private Integer idMunicion;
    private String tipoPromocion ;
    private String descripcion ;
    private Integer cantidadMinima ;
    private Double descuento ;
    private Date fechaInicio ;
    private Date fechaFin ;
}