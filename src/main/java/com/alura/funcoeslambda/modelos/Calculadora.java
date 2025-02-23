package com.alura.funcoeslambda.modelos;

import com.alura.funcoeslambda.services.Operacoes;

public class Calculadora implements Operacoes {
    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }
}
