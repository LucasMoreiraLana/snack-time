package com.lucas.snacktime.controller;


import com.lucas.snacktime.service.PratosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pratos")
public class PostCreatePratoController {

    @Autowired
    private PratosService pratosService;

    @PostMapping
    public void createPrato(@RequestBody PostCreatePratoRequest createPratoDto){
       
        pratosService.createPrato(createPratoDto);
    }

}
