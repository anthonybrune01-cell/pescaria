package com.example.demo.repository;

import com.example.demo.entidade.Pescaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PescariaRepository extends JpaRepository<Pescaria, Long>  {
}
