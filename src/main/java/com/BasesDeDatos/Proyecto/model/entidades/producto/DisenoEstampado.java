package com.BasesDeDatos.Proyecto.model.entidades.producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DisenoEstampado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diseno_estampado_seq")
    @SequenceGenerator(name = "diseno_estampado_seq", sequenceName = "DISENO_ESTAMPADO_SEQ", allocationSize = 1)
    private Integer idDisenoEstampado;

    private Integer idColorPrimario;
    private Integer idColorSecundario;
    private String nombre;
    private String tipoDePatron;
}
