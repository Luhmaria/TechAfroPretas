package Estrutura_Decisao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int number, highestNumber = 0;
		
		Scanner data = new Scanner(System.in);
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("Digite um número inteiro");
			number = data.nextInt();
			
			if(number > highestNumber) {
				highestNumber = number;
			}
		}
		
		data.close();
		System.out.println("O maior número foi: " +highestNumber);
		

	}

}
