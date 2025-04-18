package com.lucas.snacktime.service;


import com.lucas.snacktime.controller.PostLoginRequest;
import com.lucas.snacktime.model.Usuario;
import com.lucas.snacktime.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UsuarioRepository usuarioRepository;


    public boolean login(PostLoginRequest postLoginRequest) {
        Usuario usuario = usuarioRepository.findByEmail(postLoginRequest.email())
                .orElse(null);

        if (usuario == null) {
            return false;
        }

        return usuario.getSenha().equals(postLoginRequest.senha());

    }
}
