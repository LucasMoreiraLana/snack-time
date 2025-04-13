package com.lucas.snacktime.service;

import com.lucas.snacktime.controller.CreatePratosDto;
import com.lucas.snacktime.model.Prato;
import com.lucas.snacktime.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PratosService {

    @Autowired
    private PratoRepository pratoRepository;

    public void createPrato(CreatePratosDto createPratosDto){

        var entity = new Prato(
                UUID.randomUUID().toString(),
                createPratosDto.nome(),
                createPratosDto.descricao(),
                createPratosDto.tabelaNutricional()
                );

        pratoRepository.save(entity);
    }
}
