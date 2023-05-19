package Estrutura_Repeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
				
		int number, result = 0, counter = 1;
		
		System.out.println("Digite um número");
		number = data.nextInt();
		data.close();
		
		do {
			result += counter;
			counter++;
		}while(counter <= number);		
		
		System.out.println(result);
		
	}

}
