package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.model.entidades.producto.SistemaDePropulcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SistemaDePropulsionRepo  extends JpaRepository<SistemaDePropulcion, Integer> {
}
