package com.BasesDeDatos.Proyecto.model.entidades.producto;
// Import
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColor;

    private String nombre;
    private String codigoDeColor;
}