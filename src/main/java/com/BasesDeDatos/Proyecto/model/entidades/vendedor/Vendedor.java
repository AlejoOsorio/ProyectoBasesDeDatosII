package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendedor_seq")
    @SequenceGenerator(name = "vendedor_seq", sequenceName = "VENDEDOR_SEQ", allocationSize = 1)
    private Long idVendedor;

    private Long idVendedorPadre ;
    private Long idRanking ;
    private String nombre ;
    private String apellido ;
    private String email ;
    private Integer telefono ;
}
