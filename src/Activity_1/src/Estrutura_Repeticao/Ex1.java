package Estrutura_Repeticao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int childCount;
		float budgetValue, childAverage, budgetAverage, higherSalary = 0, budget100Limit=0, budgetsAmount = 0, childAmount = 0, budget100LimitPercent;
		
		for(int i = 1; i <=3 ; i++) {
			
			System.out.println("Digite o número de filhos da pessoa " +i+ ": ");
			childCount = data.nextInt();
			
			System.out.println("Digite o valor do salário da pessoa " +i+ ": ");
			budgetValue = data.nextFloat();
			
			data.close();
			
			if(budgetValue > higherSalary) {
				higherSalary = budgetValue;
			}
			
			if(budgetValue < 100) {
				budget100Limit++;
			}
			
			budgetsAmount += budgetValue;
			childAmount += childCount;
		}
			
		childAverage = childAmount/3;
		budgetAverage = budgetsAmount/3;
		budget100LimitPercent = (budget100Limit*100)/3;
		System.out.println("");
		System.out.println("A média salarial da população é de: R$ " +budgetAverage);
		System.out.println("A média de filhos da população é de: " +childAverage);
		System.out.println("O maior salário é de: R$" +higherSalary);
		System.out.println("O percentual de pessoas que recebe salário de  até R$100 é de: " +budget100LimitPercent+"%");
	}

}
