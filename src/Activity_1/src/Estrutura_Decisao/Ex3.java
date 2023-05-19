package Estrutura_Decisao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int userAge;	
		
		Scanner data = new Scanner(System.in);

		System.out.println("Digite um número");
		userAge = data.nextInt();
		data.close();
		
		if(userAge > 9 && userAge < 15) {
			System.out.println("Se encontra na categoria infantil");	
		}else if(userAge > 14 && userAge < 18) {
			System.out.println("Se encontra na categoria juvenil");	
		}else if(userAge > 17 && userAge < 26) {
			System.out.println("Se encontra na categoria adulto");	
		}

	}

}
