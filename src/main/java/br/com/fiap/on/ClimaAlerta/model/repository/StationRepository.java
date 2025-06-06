package br.com.fiap.on.ClimaAlerta.model.repository;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
}
