package com.BasesDeDatos.Proyecto.servicios.interfaces.vendedor;

import com.BasesDeDatos.Proyecto.dto.vendedor.AfiliarVendedorDTO;
import com.BasesDeDatos.Proyecto.model.entidades.vendedor.Vendedor;

public interface VendedorServicio {
    Integer obtenerGananciasMes(Integer idVendedor) ;
    Integer obtenerGananciasVa(Integer idVendedor);

}
