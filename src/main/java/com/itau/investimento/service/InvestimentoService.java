package com.itau.investimento.service;

import org.springframework.stereotype.Service;

@Service
public class InvestimentoService {
    private final double TAXA = 0.007;
    public double simular(Investimento investimento) {
        return Math.pow(1 + TAXA, investimento.getQuantidadeMeses()) * investimento.getValor();
    }
}
