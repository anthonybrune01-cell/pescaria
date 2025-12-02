package com.example.demo.controller;

import com.example.demo.entidade.Captura;
import com.example.demo.service.CapturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/capturas")
public class CapturaController {

    @Autowired
    private TelasController telas;

    @Autowired
    private CapturaService capturaService;

    @PostMapping("/salvar")
    public String salvarCaptura(Captura captura) {
        System.out.println(captura);
        capturaService.salvar(captura);
        return "redirect:/painelpescador?nome=" + telas.getMe().getNome();
    }

    // Exemplo de Controller em Spring Boot (Java)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagarCaptura(@PathVariable Long id) {
            capturaService.deletar(id);
            return ResponseEntity.ok().build(); // Retorna 200 OK sem conteúdo

    }

}
