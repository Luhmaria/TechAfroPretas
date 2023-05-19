import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int[] gameDiceValues = new int[10];
		int highestValueCount = 0, highestValue = 0, valuesAverage = 0 ;
		
		for(int i = 0; i < gameDiceValues.length; i++) {
			
			System.out.println("Digite o " +(i+1)+ "° valor: ");
			gameDiceValues[i] = data.nextInt();
			
			if(gameDiceValues[i] < 1 || gameDiceValues[i] > 6) {
				System.out.println("Dados não possuem números menores que 1 ou maiores que 6. Inicie novamente");
				System.exit(0);
			}else if (gameDiceValues[i] > highestValue) {
				highestValue = gameDiceValues[i];
			}	
		}
		data.close();
		for(int i = 0; i < gameDiceValues.length; i++) {
			System.out.println("O " +(i+1)+ "° valor foi: "+gameDiceValues[i]);	
			
			if(gameDiceValues[i] == highestValue ) {
				highestValueCount++;
			}
			
			valuesAverage += gameDiceValues[i];
		}
		
		System.out.println("A média aritmética dos lançamentos é: " +valuesAverage/10 );
		System.out.println("A maior pontuação foi: " +highestValue+ ", que apareceu " +highestValueCount+ " vezes" );
		
	}

}
