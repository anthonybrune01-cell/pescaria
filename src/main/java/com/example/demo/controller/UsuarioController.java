package com.example.demo.controller;

import com.example.demo.entidade.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private TelasController telas;

    @Autowired
    UsuarioService service;

    @PostMapping
    public String save(@ModelAttribute Usuario usuario) {

        service.save(usuario);

        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String email,
            @RequestParam String senha) {

        boolean valido = service.login(email, senha);
        telas.setMe(service.findByEmail(email));


        if (valido) {
            return "redirect:/painelpescador?nome=" + telas.getMe().getNome();
        } else {
            return "redirect:/login?erro=true";

        }

    }



}
