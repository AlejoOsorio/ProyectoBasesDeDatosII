package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.dto.producto.ArmaDTO;
import com.BasesDeDatos.Proyecto.model.entidades.producto.Arma;
import org.hibernate.annotations.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArmaRepo  extends JpaRepository<Arma, Integer> {


    @Query("SELECT new com.BasesDeDatos.Proyecto.dto.producto.ArmaDTO(a.idArma, a.nombre, a.precio) FROM Arma a")
    List<ArmaDTO> obtener_armas();

    @Query("SELECT new com.BasesDeDatos.Proyecto.dto.producto.ArmaDTO(a.idArma, a.nombre, a.precio) " +
            "FROM Arma a " +
            "WHERE lower(a.nombre) LIKE lower(concat('%', :nombre, '%'))")
    List<ArmaDTO> obtener_armas_por_nombre(@Param("nombre") String nombre);
}
