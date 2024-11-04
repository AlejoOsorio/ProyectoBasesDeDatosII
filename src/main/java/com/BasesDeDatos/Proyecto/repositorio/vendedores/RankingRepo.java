package com.BasesDeDatos.Proyecto.repositorio.vendedores;

import com.BasesDeDatos.Proyecto.model.entidades.vendedor.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingRepo  extends JpaRepository<Ranking, Long> {
}
