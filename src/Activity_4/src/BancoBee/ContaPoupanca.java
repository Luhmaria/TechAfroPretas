package BancoBee;

public class ContaPoupanca extends Conta {
	
	private int savingsCorrectionDate;
	
	public ContaPoupanca(int accountNumber,String cpf) {
		super(accountNumber,cpf);
		this.savingsCorrectionDate = 14;
	}
	
	public int getSavingsCorrectionDate() {
		return savingsCorrectionDate;
	}

	public void setSavingsCorrectionDate(int savingsCorrectionDate) {
		this.savingsCorrectionDate = savingsCorrectionDate;
	}

	public void showAccountInfo() {
		System.out.println("");
		System.out.println("CONTA POUPANÇA");
		System.out.println("");
		System.out.println("Saldo atual: R$" +this.accountBalance+ ". A data de aniversário da poupança é: " +this.savingsCorrectionDate);
		System.out.println("");
	}
	
	public void correctBalance(int day) {
		if(day == savingsCorrectionDate) {
			super.credito(this.accountBalance * 0.05);
			System.out.println("Seu saldo foi corrigido! O novo valor é: R$" +this.accountBalance);
			System.out.println("");	
			System.out.println("Obrigada por utilizar o Banco Bee. Nos vemos em breve e não se esqueça: bee unique");
			System.out.println("");
		}else {
			System.out.println("Não é o dia de aniversário da poupança");
			System.out.println("");	
			System.out.println("Obrigada por utilizar o Banco Bee. Nos vemos em breve e não se esqueça: bee unique");
			System.out.println("");
		}
	}

}
