package com.BasesDeDatos.Proyecto.repositorio.envio;

import com.BasesDeDatos.Proyecto.model.entidades.envios.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface EnvioRepo extends JpaRepository<Envio, Integer> {

    @Procedure
    Integer suma_dos_numeros(int numero1, int numero2);

}
