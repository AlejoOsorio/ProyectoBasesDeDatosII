package com.BasesDeDatos.Proyecto.repositorio.producto;

import com.BasesDeDatos.Proyecto.model.entidades.producto.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ColorRepo extends JpaRepository<Color, Integer> {

    Optional<Color> findById(Integer id);

    @Query(value = "SELECT * from color where nombre=:nombre", nativeQuery = true)
    List<Color> buscarNombre(@Param("nombre") String nombre);


    Optional<Color> findByNombre(String nombre);
}
