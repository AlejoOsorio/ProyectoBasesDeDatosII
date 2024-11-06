package com.BasesDeDatos.Proyecto.model.entidades.vendedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PagoComisiones {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pago_comisiones_seq")
    @SequenceGenerator(name = "pago_comisiones_seq", sequenceName = "PAGO_COMISIONES_SEQ", allocationSize = 1)
    private Integer idPagoComisiones;

    private Integer idVendedorRecibe;
    private Integer idVendedorPago;
    private Date fecha;
    private Double valorComision;
}
