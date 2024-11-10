package com.BasesDeDatos.Proyecto.model.entidades.vendedor;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TipoCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_cuenta_seq")
    @SequenceGenerator(name = "tipo_cuenta_seq", sequenceName = "TIPO_CUENTA_SEQ", allocationSize = 1)
    private Integer idTipoCuenta;

    private String descripcion;
}
