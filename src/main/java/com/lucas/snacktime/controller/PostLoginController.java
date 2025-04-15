package com.lucas.snacktime.controller;

import com.lucas.snacktime.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/login")
public class PostLoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity<PostLoginResponse> login(@RequestBody PostLoginRequest postLoginRequest){

        if(postLoginRequest.email() == null || postLoginRequest.senha() == null){
            return ResponseEntity.status(400).body(new PostLoginResponse(
                    400, "Email e senha são obrigatórios!"));
        }

        boolean isValid = loginService.login(postLoginRequest);
        if(isValid){
            return ResponseEntity.status(200).body(new PostLoginResponse(
                    200, "Login bem sucedido!"
            ));
        }else{
            return ResponseEntity.status(404).body(new PostLoginResponse(
                    404, "Usuário não encontrado ou credenciais incorretas!"));
        }

    }


}
