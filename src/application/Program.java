package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
   uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
   que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
   para ser responsável pelos cálculos.
 * 
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar? ");
		double dolarValor = sc.nextDouble();
		
		System.out.print("Quantos dólares você quer comprar? ");
		double qtde = sc.nextDouble();
		System.out.println();
		System.out.printf("Valor total a pagar: $ %.2f%n", Conversor.total(dolarValor, qtde));
		sc.close();
	}

}
