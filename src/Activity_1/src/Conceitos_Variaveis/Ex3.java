package Conceitos_Variaveis;
import java.util.Scanner;
public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		float firstGrade, secondGrade, thirdGrade, finalGrade;
		
		System.out.println("Digite a primeira nota: ");
		firstGrade = data.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		secondGrade = data.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		thirdGrade = data.nextFloat();
		data.close();
		
		finalGrade = ((firstGrade*2)+(secondGrade*3)+(thirdGrade*5))/10;
		
		System.out.println("A média final do aluno é: " +finalGrade);
	}
}
