package com.BasesDeDatos.Proyecto.servicios.implemetados.producto;

import com.BasesDeDatos.Proyecto.dto.producto.ArmaDTO;
import com.BasesDeDatos.Proyecto.repositorio.producto.ArmaRepo;
import com.BasesDeDatos.Proyecto.servicios.interfaces.producto.ArmaServicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArmaServiceImpl implements ArmaServicio {

    @Autowired
    ArmaRepo armaRepo;

    @Override
    public List<ArmaDTO> obtenerArmas() {
        return armaRepo.obtener_armas();
    }

    @Override
    public List<ArmaDTO> buscarArma(String nombre) {
        return armaRepo.obtener_armas_por_nombre(nombre);
    }
}
