package Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario Luana = new Funcionario("Luana",23,"Desenvolvedora Junior","Bees",'F');
		Funcionario Michelle = new Funcionario("Michelle",30,"Instrutora","Prosper",'F');
		
		Luana.visualizar();
		System.out.println("");
		Michelle.visualizar();
	}
}
