package com.BasesDeDatos.Proyecto.repositorio.ventas;

import com.BasesDeDatos.Proyecto.model.entidades.ventas.EstadoVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoVentaRepo  extends JpaRepository<EstadoVenta, Long> {

}
