package com.itau.investimento.service;

public class Investimento {
    private int quantidadeMeses;
    private double valor;

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    private double montante;

    public int getQuantidadeMeses() {
        return quantidadeMeses;
    }
    public void setQuantidadeMeses(int quantidadeMeses) {
        this.quantidadeMeses = quantidadeMeses;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
