package br.com.fiap.on.ClimaAlerta.service;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Alert;
import br.com.fiap.on.ClimaAlerta.model.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {
    @Autowired
    private AlertRepository alertRepository;

    public List<Alert> listarAlertas() {
        return alertRepository.findAll();
    }

    public Alert criarAlerta(Alert alert) {
        return alertRepository.save(alert);
    }

    public Alert atualizarAlerta(Alert alert) {
        return alertRepository.save(alert);
    }

    public void deletarAlerta(Integer id) {
        alertRepository.deleteById(id);
    }
}
