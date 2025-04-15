package com.lucas.snacktime.service;


import com.lucas.snacktime.controller.PostCreateUserRequest;

import com.lucas.snacktime.model.Usuario;
import com.lucas.snacktime.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;



    public void createUsuario(PostCreateUserRequest postCreateUserRequest){

        var entity = new Usuario(
                UUID.randomUUID().toString(),
                postCreateUserRequest.email(),
                postCreateUserRequest.senha(),
                postCreateUserRequest.turno()
        );

        usuarioRepository.save(entity);
    }




}
