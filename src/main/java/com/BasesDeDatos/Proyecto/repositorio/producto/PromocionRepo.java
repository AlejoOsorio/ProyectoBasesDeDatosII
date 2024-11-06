package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.model.entidades.producto.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromocionRepo extends JpaRepository<Promocion, Integer> {
}
