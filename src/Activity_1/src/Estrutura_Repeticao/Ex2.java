package Estrutura_Repeticao;

public class Ex2 {

	public static void main(String[] args) {
		
		int totalAmount =0;
		
		for(int i = 1; i <= 500; i++ ) {
			if(i % 2 !=0 && i % 3 == 0) {
				totalAmount += i;
			}
		}
		
		System.out.println("A soma de todos os número impares e múltiplos de 3 na faixa de 1 a 500 é: " +totalAmount);
	}

}
