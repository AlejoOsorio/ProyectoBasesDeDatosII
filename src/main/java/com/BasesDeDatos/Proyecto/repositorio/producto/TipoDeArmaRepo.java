package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.model.entidades.producto.TipoDeArma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeArmaRepo extends JpaRepository<TipoDeArma, Integer> {
}
