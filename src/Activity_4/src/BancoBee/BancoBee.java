package BancoBee;

import java.util.Scanner;

public class BancoBee {
	
	static char movement;
	static char proceed = 'S';
	static float movementValue, lendingValue;
	static int accountOption;
	static int movementCount = 0;
	static int savingsCorrectionDate;
	static int numberOfCheckBooks;
	
	static Scanner data = new Scanner (System.in);
	
	public static void header() {
		System.out.println("");
		System.out.println("BANCO BEE - G[1010]");
		System.out.println("");
		System.out.println("BEE UNIQUE");
		System.out.println("");
	}
	
	public static void chooseAcount() {
		System.out.println("1 - Conta Poupança");
		System.out.println("2 - Conta Corrente");
		System.out.println("3 - Conta Especial");
		System.out.println("4 - Conta Empresa");
		System.out.println("5 - Conta Estudantil");
		System.out.println("6 - Sair");
		System.out.println("");
		System.out.print("Digite o código da opção desejada: ");
		accountOption = data.nextInt();
	}
	
	public static void showAccountMenu() {
		System.out.println("");
		System.out.print("MOVIMENTO: D - Débito ou C - Crédito: ");
		movement = Character.toUpperCase(data.next().charAt(0));
		System.out.println("");
		System.out.print("Valor do movimento: R$");
		movementValue = data.nextFloat();
		System.out.println("");
	}
	
	public static void askToProceed() {
		System.out.println("");
		System.out.print("Continuar? [S/N]: ");
		proceed = Character.toUpperCase(data.next().charAt(0));
	}

	public static void main(String[] args) {
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(1408,"123.456.789-00");
		ContaCorrente contaCorrente = new ContaCorrente(2904,"123.456.789-00");
		ContaEspecial contaEspecial = new ContaEspecial(1110,"123.456.789-00");
		ContaEmpresa  contaEmpresa = new ContaEmpresa(1704,"123.456.789-00");
		ContaEstudantil contaEstudantil = new ContaEstudantil(2905,"123.456.789-00");
		
		header();
		chooseAcount();
		switch(accountOption) {
		case 1 : 
			contaPoupanca.showAccountInfo();
			while(movementCount < 10 && proceed == 'S') {
				showAccountMenu();
				switch(movement) {
				case 'D': 
					contaPoupanca.debito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaPoupanca.getAccountBalance());
					break;
				case 'C': 
					contaPoupanca.credito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaPoupanca.getAccountBalance());
					break;	
				default: 
					System.out.println("");
					System.out.print("Escolha uma opção válida");
					System.out.println("");
					break;
				}
				if(movementCount < 10) {
					askToProceed();	
				}
			}
			
			if(proceed == 'N' || movementCount >= 10 ) {
				System.out.println("");
				System.out.print("Digite a data de aniversário da Poupança: ");
				System.out.println("");
				savingsCorrectionDate = data.nextInt();
				contaPoupanca.correctBalance(savingsCorrectionDate);
				break;
			}
			
		case 2 :
			contaCorrente.showAccountInfo();
			while(movementCount < 10 && proceed == 'S') {
				showAccountMenu();
				switch(movement) {
				case 'D': 
					contaCorrente.debito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaCorrente.getAccountBalance());
					break;
				case 'C': 
					contaCorrente.credito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaCorrente.getAccountBalance());
					break;	
				default: 
					System.out.println("");
					System.out.print("Escolha uma opção válida");
					System.out.println("");
					break;
				}
				if(movementCount < 10) {
					askToProceed();	
				}
			}
			
			if(proceed == 'N' || movementCount >= 10 ) {
				System.out.println("");
				System.out.println("Deseja solicitar talão de cheque? Cada talão de cheque custa R$30,00 e você pode solicitar até 3.");
				System.out.print("Digite 0 caso não deseje ou o número de talões desejado: ");
				numberOfCheckBooks = data.nextInt();
				contaCorrente.askCheckBooks(numberOfCheckBooks);
				break;
			}
		
		case 3 :
			
			contaEspecial.showAccountInfo();
			while(movementCount < 10 && proceed == 'S') {
				showAccountMenu();
				switch(movement) {
				case 'D': 
					if(contaEspecial.getAccountBalance() >= movementValue) {
						contaEspecial.debito(movementValue);
					}else {
						float remaining = movementValue - contaEspecial.getAccountBalance();
						contaEspecial.useLimit(remaining);
					}
					
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaEspecial.getAccountBalance()+ " Limite diponível: " +contaEspecial.getLimit());
					break;
				case 'C': 
					contaEspecial.credito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaEspecial.getAccountBalance()+ " Limite diponível: " +contaEspecial.getLimit());
					break;	
				default: 
					System.out.println("");
					System.out.print("Escolha uma opção válida");
					System.out.println("");
					break;
				}
				if(movementCount < 10) {
					askToProceed();	
				}
			}
			
		case 4:
			contaEmpresa.showAccountInfo();
			while(movementCount < 10 && proceed == 'S') {
				showAccountMenu();
				switch(movement) {
				case 'D': 
					contaEmpresa.debito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaEmpresa.getAccountBalance()+" Limite de empréstimo disponível: R$" +contaEmpresa.getLandingLimit());
					System.out.println("");
					System.out.println("Deseja solicitar empréstimo? O valor disponível para você é de: R$" +contaEmpresa.getLandingLimit());
					System.out.print("Digite 0 caso não deseje ou o valor desejado: ");
					lendingValue = data.nextInt();
					contaEmpresa.lend(lendingValue);
					break;
				case 'C': 
					contaEmpresa.credito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaEmpresa.getAccountBalance()+" Limite de empréstimo disponível: R$" +contaEmpresa.getLandingLimit());
					System.out.println("");
					System.out.println("Deseja solicitar empréstimo? O valor disponível para você é de: R$" +contaEmpresa.getLandingLimit());
					System.out.print("Digite 0 caso não deseje ou o valor desejado: ");
					lendingValue = data.nextInt();
					contaEmpresa.lend(lendingValue);
					break;	
				default: 
					System.out.println("");
					System.out.print("Escolha uma opção válida");
					System.out.println("");
					break;
				}
				if(movementCount < 10) {
					askToProceed();	
				}
			}
			
			if(proceed == 'N' || movementCount >= 10 ) {
				System.out.println("");
				System.out.println("Deseja solicitar empréstimo? O valor disponível para você é de: R$" +contaEmpresa.getLandingLimit());
				System.out.print("Digite 0 caso não deseje ou o valor desejado: ");
				lendingValue = data.nextInt();
				contaEmpresa.lend(lendingValue);
				break;
			}
			
		case 5:
			contaEstudantil.showAccountInfo();
			while(movementCount < 10 && proceed == 'S') {
				showAccountMenu();
				switch(movement) {
				case 'D': 
					contaEstudantil.debito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaEstudantil.getAccountBalance()+" Limite de empréstimo disponível: R$" +contaEstudantil.getLandingLimit());
					System.out.println("");
					System.out.println("Deseja solicitar empréstimo? O valor disponível para você é de: R$" +contaEstudantil.getLandingLimit());
					System.out.print("Digite 0 caso não deseje ou o valor desejado: ");
					lendingValue = data.nextInt();
					contaEstudantil.lend(lendingValue);
					break;
				case 'C': 
					contaEstudantil.credito(movementValue);
					movementCount++;
					System.out.println("");
					System.out.println("Você executou " +movementCount+ " movimentos de 10 disponíveis");
					System.out.println("Saldo atualizado: R$" +contaEstudantil.getAccountBalance()+" Limite de empréstimo disponível: R$" +contaEstudantil.getLandingLimit());
					System.out.println("");
					System.out.println("Deseja solicitar empréstimo? O valor disponível para você é de: R$" +contaEstudantil.getLandingLimit());
					System.out.print("Digite 0 caso não deseje ou o valor desejado: ");
					lendingValue = data.nextInt();
					contaEstudantil.lend(lendingValue);
					break;	
				default: 
					System.out.println("");
					System.out.print("Escolha uma opção válida");
					System.out.println("");
					break;
				}
				if(movementCount < 10) {
					askToProceed();	
				}
			}
			
			if(proceed == 'N' || movementCount >= 10 ) {
				System.out.println("");
				System.out.println("Deseja solicitar empréstimo? O valor disponível para você é de: R$" +contaEstudantil.getLandingLimit());
				System.out.print("Digite 0 caso não deseje ou o valor desejado: ");
				lendingValue = data.nextInt();
				contaEstudantil.lend(lendingValue);
				break;
			}
		case 6 :
			System.out.println("");	
			System.out.println("Obrigada por utilizar o Banco Bee. Nos vemos em breve e não se esqueça: bee unique");
			System.out.println("");
			break;
		default:
			System.out.println("");
			System.out.print("Tipo de conta incorreto. Escolha uma opção válida.");
			System.out.println("");
			break;
		}
		
			
	}

}
