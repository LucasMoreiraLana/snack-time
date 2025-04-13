package com.lucas.snacktime.controller;


import com.lucas.snacktime.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/usuario")
public class PostCreateUsersController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public void createUsuario(@RequestBody CreateUsuarioDto createUsuarioDto){

        usuarioService.createUsuario(createUsuarioDto);
    }


}
