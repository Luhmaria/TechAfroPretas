package Conceitos_Variaveis;
import java.util.Scanner;
public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int lifeInDays;
		float lifeYears, lifeMonths, lifeDays;
		
		System.out.println("Digite o tempo de vida em dias: ");
		lifeInDays = data.nextInt();
		data.close();
		
		if(lifeInDays >= 365) {
			if(lifeInDays % 365 == 0) {
				lifeYears = lifeInDays/365;
				lifeMonths = 0;
				lifeDays = 0;
			}else {
				lifeYears = Math.round(lifeInDays/365);
			if((lifeInDays%365) % 30 == 0) {
				lifeMonths = ((lifeInDays%365)/30);
				lifeDays = 0;
			}else {
				lifeMonths = Math.round((lifeInDays%365)/30);
				lifeDays = ((lifeInDays % 365) % 30);
			}
			}
			}else {
				lifeYears = 0;
				if ((lifeInDays%365) % 30 == 0){
					lifeMonths = ( (lifeInDays % 365) / 30 );
					lifeDays = 0;
				}else {
					lifeMonths = Math.round((lifeInDays%365)/30);
					lifeDays = ((lifeInDays % 365) % 30);
				}	
		}
		System.out.println("Você tem " +lifeYears+ " anos, " +lifeMonths+ " meses, e " +lifeDays+ " dias de vida. ");
	}
}
