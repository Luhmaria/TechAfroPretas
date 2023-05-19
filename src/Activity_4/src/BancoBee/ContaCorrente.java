package BancoBee;

public class ContaCorrente extends Conta {
	
	private int checkBooks;
	
	public ContaCorrente(int accountNumber,String cpf) {
		super(accountNumber,cpf);
		this.checkBooks = 0;
	}
	
	public int getCheckBooks() {
		return checkBooks;
	}

	public void setCheckBooks(int checkBooks) {
		this.checkBooks = checkBooks;
	}

	public void showAccountInfo() {
		System.out.println("");
		System.out.println("CONTA CORRENTE");
		System.out.println("");
		System.out.println("Saldo atual: R$" +this.accountBalance+ ". No momento você solicitou " +this.checkBooks+ " talões de cheque");
		System.out.println("");
	}
	
	public void askCheckBooks(int numberOfCheckBooks) {
		int checkBookUnityCost = 30, checkBooksTotalCost = (numberOfCheckBooks*checkBookUnityCost);
		if(numberOfCheckBooks <= 3 && numberOfCheckBooks > 0) {
			if(this.accountBalance < checkBooksTotalCost) {
				System.out.println("");	
				System.out.println("Não há saldo suficiente para essa solicitação. O saldo é de: R$" +this.accountBalance);
				System.out.println("");	
			}else {
				super.debito(checkBooksTotalCost);
				System.out.println("Você solicitou " +numberOfCheckBooks+ " talões de cheque e o seu saldo agora é " +this.accountBalance );
				System.out.println("");	
				System.out.println("Obrigada por utilizar o Banco Bee. Nos vemos em breve e não se esqueça: bee unique");
				System.out.println("");
			}
		}else if (numberOfCheckBooks == 0) {
			System.out.println("");	
			System.out.println("Obrigada por utilizar o Banco Bee. Nos vemos em breve e não se esqueça: bee unique");
			System.out.println("");
		}else {
			System.out.println("");	
			System.out.println("Solicitação rejeitada. Você pode solicitar entre 1 e 3 talões de cheque");
			System.out.println("");
		}
		
	}

}
