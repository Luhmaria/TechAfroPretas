package Estrutura_Repeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		float number;
		
		
		System.out.println("Digite um valor numérico que será multiplicado por 3 até que seja maior que 100 : ");
		number = data.nextFloat();
		System.out.println(number);	
		
		data.close();
		while(number < 100) {
			number *= 3;
			System.out.println(number);	
		}
		
	}

}
