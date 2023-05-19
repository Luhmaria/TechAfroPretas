package BancoBee;

abstract class Conta implements MainFunctions{
	
	private int accountNumber ;
	private String cpf;
	protected float accountBalance;
	private boolean isAccountActive;
	
	protected Conta(int accountNumber, String cpf) {
		this.accountNumber = accountNumber;
		this.cpf = cpf;
		this.accountBalance = 1000;
		this.isAccountActive = true;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public boolean getIsAccountActive() {
		return isAccountActive;
	}
	public void setIsAccountActive(boolean accountIsActive) {
		this.isAccountActive = accountIsActive;
	}
	
	@Override
	public void debito(float value) {
		
		if((this.accountBalance - value) >= 0) {
			this.accountBalance = (float) (this.accountBalance - value );
		}else {
			System.out.println("Não há saldo suficiente para essa operação");
		}
		
	}
	@Override
	public void credito(double value) {
		this.accountBalance = (float) (this.accountBalance + value );
	}	
	
}
