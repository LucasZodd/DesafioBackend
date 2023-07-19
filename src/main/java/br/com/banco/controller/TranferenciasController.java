package br.com.banco.controller;

import br.com.banco.service.TransferenciaService;
import br.com.banco.service.dto.TransferenciaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/tranferencia")
public class TranferenciasController {

    @Autowired
    private TransferenciaService transferenciaService;

    @GetMapping
    public ResponseEntity<List<TransferenciaDTO>> listar() {
        return ResponseEntity.ok(transferenciaService.getTransferencias());
    }
}
