package com.BasesDeDatos.Proyecto.model.entidades.vendedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ranking {
    private Long idRanking ;
    private Double porcentajeComision ;
    private Integer cantMinima ;
    private Integer cantAumento ;
    private String nombre ;
}
