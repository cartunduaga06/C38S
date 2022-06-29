package com.example.C38S.repository;

import com.example.C38S.model.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartidoRepository extends MongoRepository<Partido, String> {

}

