package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.ComisionVentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComisionVentasRepo extends JpaRepository<ComisionVentas, Integer> {
}
