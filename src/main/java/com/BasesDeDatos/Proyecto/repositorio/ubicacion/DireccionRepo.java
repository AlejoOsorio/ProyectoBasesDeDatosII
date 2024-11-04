package com.BasesDeDatos.Proyecto.repositorio.ubicacion;

import com.BasesDeDatos.Proyecto.model.entidades.ubicacion.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepo extends JpaRepository<Direccion, Long> {
}
