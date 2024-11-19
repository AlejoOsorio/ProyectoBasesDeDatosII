package com.BasesDeDatos.Proyecto.controller.producto;

import com.BasesDeDatos.Proyecto.dto.producto.ArmaDTO;
import com.BasesDeDatos.Proyecto.servicios.interfaces.producto.ArmaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArmaController {

    private ArmaServicio armaServicio;

    @GetMapping("/obtener/armas")
    public List<ArmaDTO> obtenerArmas() throws Exception{
        return armaServicio.obtenerArmas();
    }
    @GetMapping("/buscar/arma_nombre")
    public List<ArmaDTO> obtenerArmaNombre(@RequestBody String nombre) throws Exception{
        return armaServicio.buscarArma(nombre);
    }

}
