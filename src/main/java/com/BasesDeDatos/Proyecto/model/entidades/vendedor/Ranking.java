package com.BasesDeDatos.Proyecto.model.entidades.vendedor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ranking_seq")
    @SequenceGenerator(name = "ranking_seq", sequenceName = "RANKING_SEQ", allocationSize = 1)
    private Integer idRanking;

    private Double porcentajeComision ;
    private Integer cantMinima ;
    private Integer cantAumento ;
    private String nombre ;
}
