package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.model.entidades.producto.MaterialDeConstruccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialDeConstruccionRepo  extends JpaRepository<MaterialDeConstruccion, Long> {
}
