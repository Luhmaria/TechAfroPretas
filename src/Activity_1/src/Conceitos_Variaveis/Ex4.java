package Conceitos_Variaveis;
import java.util.Scanner;
public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		float x1, x2, y1, y2, distance;
		
		System.out.println("Digite o valor de x1: ");
		x1 = data.nextFloat();
		
		System.out.println("Digite o valor de x2: ");
		x2 = data.nextFloat();
		
		System.out.println("Digite o valor de y1: ");
		y1 = data.nextFloat();
		
		System.out.println("Digite o valor de y2: ");
		y2 = data.nextFloat();
		
		data.close();
		
		distance = (float) Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
		
		System.out.println("A distância entre os pontos é de: " +distance);
	}
}
