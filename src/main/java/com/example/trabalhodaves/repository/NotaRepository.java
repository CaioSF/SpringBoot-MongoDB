package com.example.trabalhodaves.repository;

import model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotaRepository extends MongoRepository<Nota, Integer> {
    Nota save(Nota nota);
}
