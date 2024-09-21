//pacote de classe
package com.simplecalculator.average;

//importando classe fundamental para leitura de entradas de dados
import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		//criando objeto Scanner para ler dados do teclado
		Scanner sc = new Scanner(System.in);
		//declarando variáveis
		double x, y, average;
		//exibindo mensagens
		System.out.print("Digite o valor da primeira nota: ");
		//lê dado armazenado na variável de tipo double
		x = sc.nextDouble();
		System.out.print("Digite o valor da segunda nota: ");
		y = sc.nextDouble();
		//atribuindo para a varíavel do tipo double (que por padrão tinha o valor 0.0) o cálculo da média com as notas x e y
		average = ((x + y) / 2);
		System.out.print("Com base nas suas notas sua média é: " + average);
		//encerrando objeto para liberar recursos
		sc.close();
	}
}
