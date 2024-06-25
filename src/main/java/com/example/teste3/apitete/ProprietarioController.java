package com.example.teste3.apitete;

import com.example.teste3.domainModel.Proprietario;
import com.example.teste3.domainModel.repository.ProprietarioRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping(("/proprietarios"))
public class ProprietarioController {

    private String name;
    private ProprietarioRepository proprietarioRepository;

    @GetMapping
    public List<Proprietario> listar() {
       return proprietarioRepository.findAll();
       
    }
    @GetMapping("/{proprietarioID}")
        public ResponseEntity buscar (@PathVariable Long proprietarioID) {
            return proprietarioRepository.findById(proprietarioID).map(Proprietario->ResponseEntity.ok(Proprietario))
                    .orElse(ResponseEntity.notFound().build());

    }
        }




