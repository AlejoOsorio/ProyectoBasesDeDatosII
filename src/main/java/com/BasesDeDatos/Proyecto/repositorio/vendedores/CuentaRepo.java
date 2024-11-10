package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepo extends JpaRepository<Cuenta, Integer> {
}
