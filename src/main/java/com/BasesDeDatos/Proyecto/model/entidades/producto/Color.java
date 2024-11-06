package com.BasesDeDatos.Proyecto.model.entidades.producto;
// Import
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Clase Color
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "color_seq")
    @SequenceGenerator(name = "color_seq", sequenceName = "COLOR_SEQ", allocationSize = 1)
    private Integer idColor;

    private String nombre;
    private String codigoDeColor;
}