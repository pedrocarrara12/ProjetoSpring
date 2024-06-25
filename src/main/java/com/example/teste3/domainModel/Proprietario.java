package com.example.teste3.domainModel;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Proprietario {
   private String nome;
   private String email;
   private String telefone;
   @EqualsAndHashCode.Include
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long ID;


}
