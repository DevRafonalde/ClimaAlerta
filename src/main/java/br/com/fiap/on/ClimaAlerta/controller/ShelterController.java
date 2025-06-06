package br.com.fiap.on.ClimaAlerta.controller;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Shelter;
import br.com.fiap.on.ClimaAlerta.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abrigos")
public class ShelterController {
    @Autowired
    private ShelterService shelterService;

    @GetMapping("/")
    public ResponseEntity<List<Shelter>> listarShelters() {
        List<Shelter> shelters = shelterService.listarShelters();
        return new ResponseEntity<>(shelters, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Shelter> criarShelter(@RequestBody Shelter shelter) {
        Shelter shelterCriado = shelterService.criarShelter(shelter);
        return new ResponseEntity<>(shelterCriado, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shelter> atualizarShelter(@PathVariable Integer id, @RequestBody Shelter shelter) {
        Shelter shelterAtualizado = shelterService.atualizarShelter(shelter);
        return new ResponseEntity<>(shelterAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Shelter> deletarShelter(@PathVariable Integer id) {
        Shelter shelterAtualizado = shelterService.deletarShelter(id);
        return new ResponseEntity<>(shelterAtualizado, HttpStatus.OK);
    }
}
