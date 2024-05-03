package com.pattern.observer.model;

import com.pattern.observer.observer.Observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String produto;
    private BigDecimal valor;
    private BigDecimal desconto;

    public Estoque() {}

    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
        notifyObservers();
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
