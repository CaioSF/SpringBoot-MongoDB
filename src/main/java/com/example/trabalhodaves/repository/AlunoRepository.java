package com.example.trabalhodaves.repository;

import model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, String> {
    Aluno save(Aluno aluno);
}
