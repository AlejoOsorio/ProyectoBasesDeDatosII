package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.InventarioArmas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioArmasRepo  extends JpaRepository<InventarioArmas, Integer> {
}
