package br.com.fiap.on.ClimaAlerta.service;

import br.com.fiap.on.ClimaAlerta.exceptions.CondicaoNaoCumpridaException;
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
        if (shelter.getCapacity() < 5) {
            throw new CondicaoNaoCumpridaException("Os abrigos devem ter capacidade para, no mínimo, 5 pessoas");
        }

        return shelterRepository.save(shelter);
    }

    public Shelter atualizarShelter(Shelter shelter) {
        if (shelter.getCapacity() < 5) {
            throw new CondicaoNaoCumpridaException("Os abrigos devem ter capacidade para, no mínimo, 5 pessoas");
        }
        
        return shelterRepository.save(shelter);
    }

    public void deletarShelter(Integer id) {
        shelterRepository.deleteById(id);
    }
}
