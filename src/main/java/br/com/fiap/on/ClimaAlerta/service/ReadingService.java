package br.com.fiap.on.ClimaAlerta.service;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Reading;
import br.com.fiap.on.ClimaAlerta.model.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadingService {
    @Autowired
    private ReadingRepository readingRepository;

    public List<Reading> listarDados() {
        return readingRepository.findAll();
    }

    public Reading criarRegistro(Reading reading) {
        return readingRepository.save(reading);
    }
}
