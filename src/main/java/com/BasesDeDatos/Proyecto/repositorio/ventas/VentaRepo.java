package com.BasesDeDatos.Proyecto.repositorio.ventas;

import com.BasesDeDatos.Proyecto.model.entidades.ventas.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepo  extends JpaRepository<Venta, Long> {
}
