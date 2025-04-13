package com.lucas.snacktime.controller;

import com.lucas.snacktime.model.Prato;

public record CreatePratosDto(String nome, String descricao, Prato.TabelaNutricional tabelaNutricional) {



}
