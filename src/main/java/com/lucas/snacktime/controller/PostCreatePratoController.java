package com.lucas.snacktime.controller;


import com.lucas.snacktime.service.CreatePratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pratos")
public class PostCreatePratoController {

    @Autowired
    private CreatePratoService createPratoService;

    @PostMapping
    public void createPrato(@RequestBody PostCreatePratoRequest createPratoDto){
       
        createPratoService.createPrato(createPratoDto);
    }

}
