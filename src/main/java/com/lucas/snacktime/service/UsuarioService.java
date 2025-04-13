package com.lucas.snacktime.service;


import com.lucas.snacktime.controller.CreateUsuarioDto;

import com.lucas.snacktime.model.Usuario;
import com.lucas.snacktime.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.EntityReader;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EntityReader entityReader;

    public void createUsuario(CreateUsuarioDto createUsuarioDto){

        var entity = new Usuario(
                UUID.randomUUID().toString(),
                createUsuarioDto.email(),
                createUsuarioDto.senha(),
                createUsuarioDto.turno()
        );

        usuarioRepository.save(entity);
    }


}
