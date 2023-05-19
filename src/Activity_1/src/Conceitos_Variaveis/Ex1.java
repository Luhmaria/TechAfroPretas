package Conceitos_Variaveis;
import java.util.Scanner;
public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int eventTime;
		float eventHours, eventMinutes, eventSeconds;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		eventTime = data.nextInt();
		data.close();
		
		if(eventTime >= 3600) {
			if(eventTime % 3600 == 0) {
			eventHours = eventTime/3600;
			eventMinutes = 0;
			eventSeconds = 0;
			}else {
			eventHours = Math.round(eventTime/3600);
			if((eventTime%3600) % 60 == 0) {
				eventMinutes = ((eventTime%3600));
				eventSeconds = 0;
			}else {
				eventMinutes = Math.round((eventTime/3600));
				eventSeconds = ((eventTime % 3600) % 60);
			}
			}
			}else {
				eventHours = 0;
				if ((eventTime%3600) % 60 == 0){
					eventMinutes = ( (eventTime % 3600) / 60 );
					eventSeconds = 0;
				}else {
					 eventMinutes = Math.round((eventTime/3600)/60);
					 eventSeconds = ((eventTime % 3600) % 60);
				}	
		}
		System.out.println("O evento levou " +eventHours+ " horas, " +eventMinutes+ " minutos, " +eventSeconds+ " segundos. ");
	}
}
