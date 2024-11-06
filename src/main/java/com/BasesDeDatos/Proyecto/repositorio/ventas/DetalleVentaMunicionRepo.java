package com.BasesDeDatos.Proyecto.repositorio.ventas;

import com.BasesDeDatos.Proyecto.model.entidades.ventas.DetalleVentaMunicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaMunicionRepo  extends JpaRepository<DetalleVentaMunicion, Integer> {
}
