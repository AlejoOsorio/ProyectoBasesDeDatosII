package com.BasesDeDatos.Proyecto.repositorio.ubicacion;

import com.BasesDeDatos.Proyecto.model.entidades.ubicacion.TipoDireccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDireccionRepo extends JpaRepository<TipoDireccion, Long> {
}
