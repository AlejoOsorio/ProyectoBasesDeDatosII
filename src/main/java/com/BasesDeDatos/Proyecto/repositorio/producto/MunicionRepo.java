package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.model.entidades.producto.Municion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicionRepo  extends JpaRepository<Municion, Integer> {
}
