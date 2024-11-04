package com.BasesDeDatos.Proyecto.repositorio.envio;

import com.BasesDeDatos.Proyecto.model.entidades.envios.EstadoEnvio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface estadoEnvioRepo extends JpaRepository<EstadoEnvio, Long> {
}
