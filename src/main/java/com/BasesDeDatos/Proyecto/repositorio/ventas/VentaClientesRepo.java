package com.BasesDeDatos.Proyecto.repositorio.ventas;

import com.BasesDeDatos.Proyecto.model.entidades.ventas.VentaClientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaClientesRepo  extends JpaRepository<VentaClientes, Integer> {
}
