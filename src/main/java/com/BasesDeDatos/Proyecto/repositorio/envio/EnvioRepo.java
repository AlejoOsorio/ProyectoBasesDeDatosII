package com.BasesDeDatos.Proyecto.repositorio.envio;

import com.BasesDeDatos.Proyecto.model.entidades.envios.Envio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvioRepo extends JpaRepository<Envio, Integer> {
}
