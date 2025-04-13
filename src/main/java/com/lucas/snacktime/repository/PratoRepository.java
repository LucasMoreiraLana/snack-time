package com.lucas.snacktime.repository;

import com.lucas.snacktime.model.Prato;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PratoRepository extends MongoRepository<Prato, String> {

}
