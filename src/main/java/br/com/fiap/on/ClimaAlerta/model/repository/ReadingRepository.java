package br.com.fiap.on.ClimaAlerta.model.repository;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Reading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingRepository extends JpaRepository<Reading, Integer> {
}
