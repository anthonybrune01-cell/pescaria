package com.example.demo.repository;

import com.example.demo.entidade.Captura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapturaRepository extends JpaRepository<Captura, Long> {
}
