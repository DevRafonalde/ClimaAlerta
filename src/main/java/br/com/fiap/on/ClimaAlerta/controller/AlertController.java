package br.com.fiap.on.ClimaAlerta.controller;

import br.com.fiap.on.ClimaAlerta.model.entity.orm.Alert;
import br.com.fiap.on.ClimaAlerta.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertController {
    @Autowired
    private AlertService alertService;

    @GetMapping("/")
    public ResponseEntity<List<Alert>> listarAlertas() {
        List<Alert> alertas = alertService.listarAlertas();
        return new ResponseEntity<>(alertas, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Alert> criarAlerta(@RequestBody Alert alert) {
        Alert alertaCriado = alertService.criarAlerta(alert);
        return new ResponseEntity<>(alertaCriado, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alert> atualizarAlerta(@PathVariable Integer id, @RequestBody Alert alert) {
        Alert alertaAtualizado = alertService.atualizarAlerta(alert);
        return new ResponseEntity<>(alertaAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Alert> deletarAlerta(@PathVariable Integer id) {
        Alert alertaAtualizado = alertService.deletarAlerta(id);
        return new ResponseEntity<>(alertaAtualizado, HttpStatus.OK);
    }
}
