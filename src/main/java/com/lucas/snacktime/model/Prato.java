package com.lucas.snacktime.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "pratos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prato {

    @Id
    private String id;

    private String nome;

    private String descricao;

    private TabelaNutricional tabelaNutricional;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class TabelaNutricional {
        private double calorias;
        private double proteinas;
        private double lipideos;
        private double carboidratos;
        private double fibras;
        private double sodio;
    }

}
