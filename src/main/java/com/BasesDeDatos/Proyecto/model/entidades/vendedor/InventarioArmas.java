package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InventarioArmas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventario_armas_seq")
    @SequenceGenerator(name = "inventario_armas_seq", sequenceName = "INVENTARIO_ARMAS_SEQ", allocationSize = 1)
    private Integer idInventarioArmas;

    private Integer idArma;
    private Integer idVendedor;
    private Integer cantidad;
}