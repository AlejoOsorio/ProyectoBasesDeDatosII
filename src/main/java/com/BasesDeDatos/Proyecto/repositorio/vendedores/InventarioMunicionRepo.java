package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.InventarioMunicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioMunicionRepo  extends JpaRepository<InventarioMunicion, Integer> {

}
