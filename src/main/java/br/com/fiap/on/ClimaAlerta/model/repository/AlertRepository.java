package br.com.fiap.on.ClimaAlerta.model.repository;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Integer> {
}
