
package Estrutura_Repeticao;

public class Ex5 {

	public static void main(String[] args) {
		
				
		int number = 233;
		System.out.println(number);
		do {
			if(number >= 300 && number < 400) {
				number +=3;
				System.out.println(number+ " somando de 3 em 3");
			}else {
				number += 5;
				System.out.println(number+ " somando de 5 em 5");
			}
		}while(number <= 456);		
		
	}

}
