package com.pattern.observer.model;

import com.pattern.observer.observer.Observer;

import java.math.BigDecimal;

public class Gerente implements Observer {
    private String nome;

    public Gerente() {
    }

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Estoque estoque) {
        BigDecimal valor = estoque.getValor();
        BigDecimal limite = new BigDecimal("1000.00");
        if(valor.compareTo(limite)>0){
            System.out.println("Gerente " +nome + " : notificação de produto em estoque com valor de: R$" +estoque.getValor());
        }
    }
}
