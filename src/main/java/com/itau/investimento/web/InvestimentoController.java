package com.itau.investimento.web;

import com.itau.investimento.service.Investimento;
import com.itau.investimento.service.InvestimentoService;
import com.itau.investimento.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService;

    @PostMapping("investimento/")
    public Investimento simularInvestimento(@RequestBody Investimento investimento) {
        double montante = investimentoService.simular(investimento);
        investimento.setMontante(montante);
        return investimento;
    }

}
