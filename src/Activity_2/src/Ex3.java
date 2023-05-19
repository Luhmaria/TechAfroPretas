import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		float[][] N1  = new float[4][6];
		float[][] N2  = new float[4][6];
		float M1 [][] = new float[4][6];
		float M2 [][] = new float[4][6];
		
		for(int line = 0; line < 4 ; line++) {
			for(int column = 0; column < 6; column++ ) {
				System.out.println("(N1) Digite o valor para a posição ["+line+"]["+column+"]: ");
				N1[line][column] = data.nextFloat();
			}
		}
		for(int line = 0; line < 4 ; line++) {
			for(int column = 0; column < 6; column++ ) {
				System.out.println("(N2) Digite o valor para a posição ["+line+"]["+column+"]: ");
				N2[line][column] = data.nextFloat();
			}
		}
		data.close();
		for(int line = 0; line < 4 ; line++) {
			for(int column = 0; column < 6; column++ ) {
				System.out.println("(N2) Digite o valor para a posição ["+line+"]["+column+"]: ");
				M1[line][column] = (N1[line][column] + N1[line][column]);
				M2[line][column] = (N1[line][column] - N1[line][column]);
			}
		}
		for(int line = 0; line < 4 ; line++) {
			for(int column = 0; column < 6; column++ ) {
				System.out.println("(M1)posição ["+line+"]["+column+"]: " +M1[line][column]);
				System.out.println("(M2)posição ["+line+"]["+column+"]: " +M2[line][column]);
			}
		}
	}

}
