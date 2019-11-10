package model;

import java.sql.Date;

public class Paciente {

	private String nome, rua, telefone, orgExp, municipio, cpf, rg, sus, sexo, queixa, prioridade;
	private Date data_nascimento;
	private int numero_casa, id;
	
	
	
	public Paciente(int id) {
		super();
		this.id = id;
	}

	public Paciente(String nome, String rua, String telefone, String orgExp, String municipio, String cpf, String rg,
			String sus, String sexo, String queixa, Date data_nascimento, int numero_casa) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.telefone = telefone;
		this.orgExp = orgExp;
		this.municipio = municipio;
		this.cpf = cpf;
		this.rg = rg;
		this.sus = sus;
		this.sexo = sexo;
		this.queixa = queixa;
		this.data_nascimento = data_nascimento;
		this.numero_casa = numero_casa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getOrgExp() {
		return orgExp;
	}

	public void setOrgExp(String orgExp) {
		this.orgExp = orgExp;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
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

	public String getSus() {
		return sus;
	}

	public void setSus(String sus) {
		this.sus = sus;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public int getId() {
		return id;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	
	
	
}
