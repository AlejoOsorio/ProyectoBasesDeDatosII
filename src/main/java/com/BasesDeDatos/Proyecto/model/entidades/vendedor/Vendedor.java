package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendedor {
    private Long idVendedor ;
    private Long idVendedorPadre ;
    private Long idRanking ;
    private String nombre ;
    private String apellido ;
    private String email ;
    private Number telefono ;
}
