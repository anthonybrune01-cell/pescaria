package com.example.demo.controller;

import com.example.demo.entidade.Captura;
import com.example.demo.entidade.Especie;
import com.example.demo.entidade.Usuario;
import com.example.demo.repository.CapturaRepository;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TelasController {

    private Usuario me;

    @Autowired
    private CapturaRepository capturaRepositorio;

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping(value = "/painelpescador")
    public String painelpescador(Model model, @RequestParam String nome) {
        model.addAttribute("nome", nome);
        return "painelpescador";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {

        model.addAttribute("usuario", me);

        return "perfil";
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


    @GetMapping("/historico-capturas")
    public String mostrarHistorico(Model model) {

        List<Captura> capturas = capturaRepositorio.findAll();
        model.addAttribute("capturas", capturas);

        return "historicocapturas";
    }
    @GetMapping("/mapa")
    public String mapaAreas() {
        return "mapaareas";
    }
    @GetMapping("/normativas")
    public String normativas() {
        return "normativas";
    }




    public void setMe(Usuario me) {
        this.me = me;
    }

    public Usuario getMe() {
        return me;
    }
}
