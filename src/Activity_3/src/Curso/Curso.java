package Curso;

public class Curso {
	
	private String titulo;
	private String assunto;
	private String instrutor;
	private String escola;
	private boolean emAndamento;
	
	public Curso (String titulo, String assunto, String instrutor, String escola, boolean emAndamento) {
		this.titulo = titulo;
		this.assunto = assunto;
		this.instrutor = instrutor;
		this.escola = escola;
		this.emAndamento = emAndamento;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAssunto() {
		return assunto;
	}


	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}


	public String getInstrutor() {
		return instrutor;
	}


	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}


	public String getEscola() {
		return escola;
	}


	public void setEscola(String escola) {
		this.escola = escola;
	}


	public boolean isEmAndamento() {
		return emAndamento;
	}


	public void setEmAndamento(boolean emAndamento) {
		this.emAndamento = emAndamento;
	}


	public void visualizar () {
		System.out.println("Titulo do curso: " +this.titulo);
		System.out.println("Assunto abordado: " +this.assunto);
		System.out.println("Instrutor(a) responsável: " +this.instrutor);
		System.out.println("Escola ministrante: " +this.escola);
		System.out.println("Curso em andamento?: " +this.emAndamento);
	}
}
