package com.BasesDeDatos.Proyecto.repositorio.ubicacion;

import com.BasesDeDatos.Proyecto.model.entidades.ubicacion.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepo extends JpaRepository<Departamento, Integer> {
}
