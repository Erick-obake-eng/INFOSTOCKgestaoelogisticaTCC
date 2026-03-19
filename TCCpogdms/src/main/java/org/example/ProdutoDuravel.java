package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class ProdutoDuravel extends Produto {
    private int mesesdaGarantia;
    private LocalDate dataFabricacao;

    public LocalDate calcularDataFimGarantia() {
        long mesesGarantia = 0;
        return dataFabricacao.plusMonths(mesesGarantia);
    }
    @Override
    public boolean estaProximoDaVidaUtilFinal(LocalDate hoje) {
        return false;
    }

    @Override
    public ChronoLocalDate getDataValidade() {
        return null;
    }
}