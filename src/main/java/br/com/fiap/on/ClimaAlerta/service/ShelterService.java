package br.com.fiap.on.ClimaAlerta.service;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Shelter;
import br.com.fiap.on.ClimaAlerta.model.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {
    @Autowired
    private ShelterRepository shelterRepository;

    public List<Shelter> listarShelters() {
        return shelterRepository.findAll();
    }

    public Shelter criarShelter(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

    public Shelter atualizarShelter(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

    public void deletarShelter(Integer id) {
        shelterRepository.deleteById(id);
    }
}
