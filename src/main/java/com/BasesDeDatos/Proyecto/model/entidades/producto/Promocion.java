package com.BasesDeDatos.Proyecto.model.entidades.producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Promocion {
    private Long idPromocion;
    private Long idArma;
    private Long idMunicion;
    private String tipoPromocion ;
    private String descripcion ;
    private Integer cantidadMinima ;
    private Double descuento ;
    private Date fechaInicio ;
    private Date fechaFin ;
}