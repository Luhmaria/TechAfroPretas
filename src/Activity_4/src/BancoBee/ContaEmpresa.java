package BancoBee;

public class ContaEmpresa extends Conta {
	
	private float landingLimit, lended;
	
	public ContaEmpresa(int accountNumber,String cpf) {
		super(accountNumber,cpf);
		this.landingLimit = 10000;
		this.lended = 0;
	}
	
	public void showAccountInfo() {
		System.out.println("");
		System.out.println("CONTA EMPRESARIAL");
		System.out.println("");
		System.out.println("Saldo atual: R$" +this.accountBalance+ ". Você possui R$" +this.landingLimit+ " disponível para empréstimo");
		System.out.println("");
	}
	
	public float getLandingLimit() {
		return landingLimit;
	}

	public void setLandingLimit(float landingLimit) {
		this.landingLimit = landingLimit;
	}

	public float getLended() {
		return lended;
	}

	public void setLended(float lended) {
		this.lended = lended;
	}

	public void lend (float value) {
		if(value != 0) {
			if(value <= landingLimit) {
				super.credito(value);
				setLended(value);
				this.landingLimit -= value;
				System.out.println("");
				System.out.println("Saldo atual: R$" +this.accountBalance+ ". Você possui R$" +this.landingLimit+ " disponível para empréstimo");
				System.out.println("");
			}else {
				System.out.println("");
				System.out.println("Não há limite de empréstimo suficiente. Você possui R$" +this.landingLimit+ " disponível para empréstimo");
				System.out.println("");
			}
		}else {
			System.out.println("");	
			System.out.println("Obrigada por utilizar o Banco Bee. Nos vemos em breve e não se esqueça: bee unique");
			System.out.println("");
		}
	}



}
