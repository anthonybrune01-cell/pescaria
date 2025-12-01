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
    UsuarioService service;

    @PostMapping
    public ResponseEntity<Usuario> save (@ModelAttribute Usuario usuario) {
        Usuario user = service.save(usuario);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String email,
            @RequestParam String senha) {

        boolean valido = service.login(email, senha);

        if (valido) {
            return "redirect:/painelpescador";
        } else {
            return "redirect:/login?erro=true";

        }

    }



}
