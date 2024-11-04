package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepo  extends JpaRepository<Vendedor, Long> {
}
