package Funcionario;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cargo;
	private String empresa;
	private char sexo;
	
	public Funcionario (String nome, int idade, String cargo, String empresa, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.empresa = empresa;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void visualizar () {
		System.out.println("Nome: " +this.nome);
		System.out.println("Idade: " +this.idade);
		System.out.println("Cargo: " +this.cargo);
		System.out.println("Empresa: " +this.empresa);
		System.out.println("Sexo: " +this.sexo);
	}
}
