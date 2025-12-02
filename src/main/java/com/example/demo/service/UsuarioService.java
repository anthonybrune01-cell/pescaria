package com.example.demo.service;

import com.example.demo.entidade.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Transactional
    public Usuario save (Usuario usuario) {
        Usuario existente = repository.findByEmail(usuario.getEmail());
        if (existente != null) {
            throw new RuntimeException("E-mail já cadastrado!");
        }

        return repository.save(usuario);
    }

    public List<Usuario> findAll () {
        return repository.findAll();
    }

    public boolean login(String email, String senha) {
        Usuario usuario = repository.findByEmail(email);

        if (usuario == null) {
            return false;
        }

        return usuario.getSenha().equals(senha);
    }

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    public Usuario findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
