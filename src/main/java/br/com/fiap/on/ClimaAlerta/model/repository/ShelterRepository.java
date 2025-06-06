package br.com.fiap.on.ClimaAlerta.model.repository;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelterRepository extends JpaRepository<Shelter, Integer> {
}
