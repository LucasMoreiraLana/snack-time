package com.lucas.snacktime.service;

import com.lucas.snacktime.controller.PostCreatePratoRequest;
import com.lucas.snacktime.model.Prato;
import com.lucas.snacktime.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PratosService {

    @Autowired
    private PratoRepository pratoRepository;

    public void createPrato(PostCreatePratoRequest postCreatePratoRequest){

        var entity = new Prato(
                UUID.randomUUID().toString(),
                postCreatePratoRequest.nome(),
                postCreatePratoRequest.descricao(),
                postCreatePratoRequest.tabelaNutricional()
                );

        pratoRepository.save(entity);
    }
}
