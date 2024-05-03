package com.pattern.observer;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ObserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);

		//deve notificar o gerente
		BigDecimal valorInicial = new BigDecimal("1900.00");
		BigDecimal desconto = new BigDecimal("10.0");
		Gerente gerente1 = new Gerente("João");
		Estoque estoque1 = new Estoque("Celular", valorInicial,
				desconto);
		estoque1.attach(gerente1);
		estoque1.setValor(valorInicial);

		//NÃO deve notificar o gerente
		valorInicial = new BigDecimal("40.00");
		desconto = new BigDecimal("5.0");
		Gerente gerente2 = new Gerente("Cláudia");
		Estoque estoque2 = new Estoque("Camiseta", valorInicial,
				desconto);
		estoque2.attach(gerente2);
		estoque2.setValor(valorInicial);
		/*
		 output esperado:

		 Gerente João : notificação de produto em estoque com valor de: R$1900.00

		 */
	}
}
