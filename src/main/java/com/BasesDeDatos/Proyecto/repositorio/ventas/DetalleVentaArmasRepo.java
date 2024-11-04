package com.BasesDeDatos.Proyecto.repositorio.ventas;

import com.BasesDeDatos.Proyecto.model.entidades.ventas.DetalleVentaArma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaArmasRepo extends JpaRepository<DetalleVentaArma, Long> {
}
