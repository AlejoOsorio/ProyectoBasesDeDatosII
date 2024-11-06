package com.BasesDeDatos.Proyecto.model.entidades.producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ModoDeDisparo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "modo_disparo_seq")
    @SequenceGenerator(name = "modo_disparo_seq", sequenceName = "MODO_DISPARO_SEQ", allocationSize = 1)
    private Integer idModoDeDisparo;

    private String tipoDeDisparo;
    private String velocidadDeDisparo;
    private Double intervaloEntreDisparos;
}