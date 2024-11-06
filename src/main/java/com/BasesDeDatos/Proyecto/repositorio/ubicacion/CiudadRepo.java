package com.BasesDeDatos.Proyecto.repositorio.ubicacion;

import com.BasesDeDatos.Proyecto.model.entidades.ubicacion.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepo extends JpaRepository<Ciudad, Integer> {
}
