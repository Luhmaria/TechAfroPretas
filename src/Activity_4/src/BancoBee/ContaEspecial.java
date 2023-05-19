package BancoBee;

public class ContaEspecial extends Conta {
	
	private float limit;
	
	public ContaEspecial(int accountNumber,String cpf) {
		super(accountNumber,cpf);
		this.limit = 1000;
	}
	
	public void showAccountInfo() {
		System.out.println("");
		System.out.println("CONTA ESPECIAL");
		System.out.println("");
		System.out.println("Saldo atual: R$" +this.accountBalance+ ". No momento você possui R$" +this.limit+ " de limite");
		System.out.println("");
	}
	
	public void useLimit (float value) {
		if(this.limit-value >= 0) {
			this.limit -= value;
			System.out.println("Você utilizou seu limite. O novo saldo de limite é: "+this.limit);
		}else {
			System.out.println("");
			System.out.println("Você não possui saldo ou limite suficiente para essa transação");
			System.out.println("");
		}
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}

}
