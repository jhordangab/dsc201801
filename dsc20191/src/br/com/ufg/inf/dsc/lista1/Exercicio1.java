package br.com.ufg.inf.dsc.lista1;

import java.util.concurrent.TimeUnit;

//1.C�lculo de PI.
//Leibniz, em 1682, desenvolveu uma s�rie para o c�lculo do \pi:
//Escreva um algoritmo que calcula um valor aproximado para PI usando a s�rie desenvolvida
//por Leibniz. Ser� necess�rio calcular a s�rie com pelo menos 10000 termos
//Marque o tempo gasto para realizar o c�lculo. Escreva o valor de PI e o tempo..

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

		System.out.println("O valor de PI � '" + pi + "'");
		System.out.println("O tempo gasto para realizar o processamento foi '"
				+ TimeUnit.MILLISECONDS.toSeconds(tempoTotal) + "s'");
	}
}
