package com.example.demo.service;

import com.example.demo.entidade.Captura;
import com.example.demo.entidade.Pescaria;
import com.example.demo.entidade.Especie;
import com.example.demo.repository.CapturaRepository;
import com.example.demo.repository.PescariaRepository;
import com.example.demo.repository.EspecieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CapturaService {

    private final CapturaRepository repository;

    public Captura salvar(Captura captura) {
        return repository.save(captura);
    }

}
