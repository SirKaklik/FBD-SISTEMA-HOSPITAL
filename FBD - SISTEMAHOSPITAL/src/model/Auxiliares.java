package model;

public class Auxiliares {
	
	private Integer id;
	private String cpf, rg, nome;
	
	
	
	public Auxiliares(Integer id) {
		super();
		this.id = id;
	}

	public Auxiliares(String cpf, String rg, String nome) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	
	
}
