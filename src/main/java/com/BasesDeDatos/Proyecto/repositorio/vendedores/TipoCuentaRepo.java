package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.TipoCuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoCuentaRepo extends JpaRepository<TipoCuenta,Integer> {
}
