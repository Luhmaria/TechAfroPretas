package Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso React = new Curso("Módulo 3: React", "Programação em React", "Nicole Pimenta", "Kenzie Academy Brasil", true);
		Curso Trilha = new Curso("Trilha de formação Tech Afro Pretas", "Programação em Java", "Michelle de Souza", "Prosper Tech", true);
		
		React.visualizar();
		System.out.println("");
		Trilha.visualizar();

	}

}
