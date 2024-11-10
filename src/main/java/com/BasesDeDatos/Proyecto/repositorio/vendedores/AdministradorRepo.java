package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepo extends JpaRepository<Administrador, Integer> {
}
