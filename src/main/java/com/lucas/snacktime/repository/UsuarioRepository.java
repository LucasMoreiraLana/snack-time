package com.lucas.snacktime.repository;

import com.lucas.snacktime.model.Prato;
import com.lucas.snacktime.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
