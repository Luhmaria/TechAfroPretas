import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		
		float highestGrade = 0, gradeList[] = new float[5];
		
		Scanner data = new Scanner(System.in);
		
		for(int i = 0; i < gradeList.length; i++) {
			System.out.println("Digite a " +(i+1)+ " ª pontuação: ");
			gradeList[i] = data.nextFloat();
			if(gradeList[i] > highestGrade) {
				highestGrade = gradeList[i];
			}
		}
		System.out.println("A maior pontuação foi: " +highestGrade);
		data.close();
		
	}

}
