package com.lucas.snacktime.controller;


import com.lucas.snacktime.service.CreateUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuario")
public class PostCreateUserController {

    @Autowired
    private CreateUsuarioService createUsuarioService;

    @PostMapping
    public void createUsuario(@RequestBody PostCreateUserRequest postCreateUserRequest){

        createUsuarioService.createUsuario(postCreateUserRequest);
    }


}
