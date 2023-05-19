import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		float[][] values  = new float[3][3];
		float valuesAmount = 0, diagonalValue;

		
		for(int line = 0; line < 3 ; line++) {
			for(int column = 0; column < 3; column++ ) {
				System.out.println("Digite o valor para a posição ["+line+"]["+column+"]: ");
				values[line][column] = data.nextFloat();
				valuesAmount += values[line][column];
			}
		}
		data.close();
		diagonalValue = (values[0][0]+values[1][1]+values[2][2]);
		System.out.println("A soma total dos valores informados é: " +valuesAmount);
		System.out.println("A soma da diagonal principal dos valores informados é: " +diagonalValue);
	}

}
