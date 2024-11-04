package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.HistorialRanking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorialRankingRepo  extends JpaRepository<HistorialRanking, Long> {
}
