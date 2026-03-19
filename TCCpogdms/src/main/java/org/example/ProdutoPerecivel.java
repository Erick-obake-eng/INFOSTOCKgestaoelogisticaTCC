package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class ProdutoPerecivel extends Produto {
    private int dataValidade;
    private int diasAvisoVencimento;
    @Override
    public boolean estaProximoDaVidaUtilFinal(LocalDate hoje) {
        return Period.between(hoje, LocalDate.ofEpochDay(dataValidade)).getDays() <= diasAvisoVencimento;
    }

    @Override
    public ChronoLocalDate getDataValidade() {
        return null;
    }
}