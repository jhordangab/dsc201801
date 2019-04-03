package br.com.ufg.inf.dsc.lista1;

import java.util.concurrent.TimeUnit;

//1.Cálculo de PI.
//Leibniz, em 1682, desenvolveu uma série para o cálculo do \pi:
//Escreva um algoritmo que calcula um valor aproximado para PI usando a série desenvolvida
//por Leibniz. Será necessário calcular a série com pelo menos 10000 termos
//Marque o tempo gasto para realizar o cálculo. Escreva o valor de PI e o tempo..

public class Exercicio1 {
	
	public static void main(String[] args) {

		double pi = 0;
		double denominator = 1;
		int termos = 10000;
		long tempoInicial, tempoFinal, tempoTotal;
		tempoInicial = System.currentTimeMillis();

		for (int x = 0; x < termos; x++) {

			if (x % 2 == 0) {
				pi = pi + (1 / denominator);
			} else {
				pi = pi - (1 / denominator);
			}
			denominator = denominator + 2;
		}

		pi = pi * 4;
		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;

		System.out.println("O valor de PI é '" + pi + "'");
		System.out.println("O tempo gasto para realizar o processamento foi '"
				+ TimeUnit.MILLISECONDS.toSeconds(tempoTotal) + "s'");
	}
}
