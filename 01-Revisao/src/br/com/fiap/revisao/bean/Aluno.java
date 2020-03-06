package br.com.fiap.revisao.bean;

public class Aluno extends Pessoa {

	private String nome;
	
	private Integer rm;
	
	private Genero genero;
	
	//Construtores
	public Aluno(int rm, int idade) {
		super(idade);
		this.rm = rm;
	}

	//Sobrecarga - overload
	public void estudar(String disciplina, long tempo) {
		
	}
	
	//Sobrescrita - override
	public void estudar(String disciplina) {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getRm() {
		return rm;
	}

	public void setRm(Integer rm) {
		this.rm = rm;
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
