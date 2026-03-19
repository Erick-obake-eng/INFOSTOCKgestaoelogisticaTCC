package org.example;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public abstract class Produto {
    private Long id_produto;
    private String nome;
    private String codigoBarras;
    private String categoria;

    public abstract boolean estaProximoDaVidaUtilFinal(LocalDate hoje);

    public abstract ChronoLocalDate getDataValidade();
}
