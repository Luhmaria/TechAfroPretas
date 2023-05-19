package Estrutura_Repeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		float number = 0, valuesSum = 0, valuesAverage, valuesAmount = 0;
		
		while(number >= 0) {
			System.out.println("Digite um valor numérico (a execução vai parar quando digitar um número negativo) : ");
			number = data.nextFloat();
			
			if(number > 0) {
				valuesSum += number;
				valuesAmount++;
			}
		}
		data.close();
		valuesAverage = valuesSum / valuesAmount;
		
		System.out.println("A somatória dos valores informados foi de : " +valuesSum);
		System.out.println("A média dos valores informados foi de : " +valuesAverage);
		System.out.println("A quantidade de valores informados foi de : " +valuesAmount);
	}

}
