package br.com.fiap.on.ClimaAlerta.controller;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Reading;
import br.com.fiap.on.ClimaAlerta.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monitoramento")
public class ReadingController {
    @Autowired
    private ReadingService readingService;

    @GetMapping("/")
    public ResponseEntity<List<Reading>> listarDados() {
        List<Reading> dados = readingService.listarDados();
        return new ResponseEntity<>(dados, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Reading> criarRegistro(@RequestBody Reading reading) {
        Reading registro = readingService.criarRegistro(reading);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }
}
