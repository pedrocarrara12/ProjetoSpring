package com.example.teste3.domainModel.repository;

import com.example.teste3.domainModel.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProprietarioRepository extends JpaRepository<Proprietario,Long> {

    List<Proprietario> findByNome(String nome);
}
