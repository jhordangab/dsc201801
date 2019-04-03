package br.com.ufg.inf.dsc.lista1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//2.Crie um programa que abrir o arquivo “numeros.txt”, e verifique qual(is) números aparece mais vezes
//(são números entre 1 e 255, inclusive). Escreva o número e o tempo gasto para fazer processamento.
//C:\\Users\\Alunoinf_2\\Downloads\\numeros.txt

public class Exercicio2 {
	public static void main(String[] args) throws IOException {

		long tempoInicial, tempoFinal, tempoTotal;
		tempoInicial = System.currentTimeMillis();

		System.out.println("Informe o caminho do arquivo 'numeros.txt':");
		Scanner leitor = new Scanner(System.in);
		String path = leitor.next();

		Path filePath = Paths.get(path);
		Scanner scanner = new Scanner(filePath);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				list.add(scanner.nextInt());
			} else {
				scanner.next();
			}
		}

		Collections.sort(list);
		Map<Integer, Integer> repetidos = new HashMap<Integer, Integer>();

		for (int numero : list) {
			if (repetidos.containsKey(numero)) {
				repetidos.put(numero, repetidos.get(numero) + 1);
			} else {
				repetidos.put(numero, 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : repetidos.entrySet()) {
			System.out.println("O número'" + entry.getKey() + "' apareceu " + entry.getValue() + " vezes");
		}

		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;

		System.out.println("O tempo gasto para realizar o processamento foi '"
				+ TimeUnit.MILLISECONDS.toSeconds(tempoTotal) + "s'");
	}
}
