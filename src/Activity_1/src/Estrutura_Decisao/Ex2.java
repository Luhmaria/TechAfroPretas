package Estrutura_Decisao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		float firstNumber, secondNumber, thirdNumber, userNumber;		
		
		Scanner data = new Scanner(System.in);

		System.out.println("Digite um número");
		userNumber = data.nextFloat();
		
		firstNumber = userNumber;
		secondNumber= userNumber; 
		thirdNumber = userNumber;
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite um número");
			userNumber = data.nextFloat();
			
			if (userNumber < firstNumber) {
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = userNumber;
            } else if (userNumber < secondNumber) {
                thirdNumber = secondNumber;
                secondNumber = userNumber;
            } else {
                thirdNumber = userNumber;
            }
			
		}	
			
		data.close();
		System.out.println("A ordem crescente dos números é: " +firstNumber+ "-" +secondNumber+ "-" +thirdNumber);	

	}

}
