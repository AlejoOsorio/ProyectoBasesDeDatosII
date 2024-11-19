package com.BasesDeDatos.Proyecto.servicios.implemetados.vendedor;

import com.BasesDeDatos.Proyecto.repositorio.vendedores.VendedorRepo;
import com.BasesDeDatos.Proyecto.servicios.interfaces.vendedor.VendedorServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VenededorImpl implements VendedorServicio {

    @Autowired
    VendedorRepo vendedorRepo;

    @Override
    public Integer obtenerGananciasMes(Integer idVendedor) {
        return vendedorRepo.calcular_ganancias_mes(idVendedor);
    }

    @Override
    public Integer obtenerGananciasVa(Integer idVendedor) {
        return vendedorRepo.calcular_ganancias_va_mes(idVendedor);
    }
}
