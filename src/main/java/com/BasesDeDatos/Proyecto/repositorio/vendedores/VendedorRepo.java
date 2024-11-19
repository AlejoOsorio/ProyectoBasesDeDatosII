package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface VendedorRepo  extends JpaRepository<Vendedor, Integer> {

    @Procedure
    Integer calcular_ganancias_mes(Integer id_vendedor);

    @Procedure
    Integer calcular_ganancias_va_mes(Integer id_vendedor);
}
