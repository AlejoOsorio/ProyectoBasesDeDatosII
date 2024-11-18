package com.BasesDeDatos.Proyecto.servicios.interfaces.producto;

import com.BasesDeDatos.Proyecto.dto.producto.ArmaDTO;

import java.util.List;

public interface ArmaServicio {

    List<ArmaDTO> obtenerArmas();

    List<ArmaDTO> buscarArma(String nombre);
}
