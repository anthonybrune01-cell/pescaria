package com.example.demo.controller;

import com.example.demo.entidade.Especie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TelasController {

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping(value = "painelpescador")
    public String painelpescador() {
        return "painelpescador";
    }

    @GetMapping(value = "registrocapitura")
    public String registrocapitura(Model model) {
        model.addAttribute("especies", List.of(
                new Especie(1L, "Tilápia"),
                new Especie(2L, "Tucunaré"),
                new Especie(3L, "Piau")
        ));

        model.addAttribute("dataAtual", LocalDate.now());
        return "registrocapitura";
    }
}
