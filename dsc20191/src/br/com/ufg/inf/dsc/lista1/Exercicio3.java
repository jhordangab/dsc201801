package br.com.ufg.inf.dsc.lista1;

import java.util.concurrent.TimeUnit;

//3.Faça um programa em Java que identifique e escreva todos os números primos entre 1 e 300.000.
//Marque o tempo gasto para realizar tal cálculo e escreva este tempo no final.

public class Exercicio3 {

	public static void main(String[] args) {

		int termos = 300000;
		int div = 0;
		long tempoInicial, tempoFinal, tempoTotal;
		tempoInicial = System.currentTimeMillis();

		for (int numero = 1; numero <= termos; numero++) {
			div = 0;
			for (int auxiliar = 1; auxiliar <= termos; auxiliar++) {
				if (numero % auxiliar == 0) {
					div++;
				}
			}
			if (div == 2) {
				System.out.println(numero);
			}
		}

		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;

		System.out.println("O tempo gasto para realizar o processamento foi '"
				+ TimeUnit.MILLISECONDS.toSeconds(tempoTotal) + "s'");
	}
}
