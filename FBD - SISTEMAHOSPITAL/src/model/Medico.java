package model;

public class Medico {

	private Integer id;
	private String especialidade, telefone, nome;
	private String cpf, rg;
	
	
	
	public Medico(Integer id) {
		super();
		this.id = id;
	}

	public Medico(String especialidade, String telefone, String nome, String cpf, String rg) {
		super();
		this.especialidade = especialidade;
		this.telefone = telefone;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
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
	public Integer getId() {
		return id;
	}
	
	
}
