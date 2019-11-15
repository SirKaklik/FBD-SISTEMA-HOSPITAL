package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Paciente;
import sqlUtil.SQLUtil;
import sqlUtil.SQL_Connection;

public class DAOPaciente implements IDAOPaciente{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	
	@Override
	public boolean salvarEditar(Paciente paciente) {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Paciente.INSERT_ALL);
			statement.setString(1, paciente.getNome());
			statement.setString(2, paciente.getData_nascimento());
			statement.setString(3, paciente.getTelefone());
			statement.setString(4, paciente.getOrgExp());
			statement.setString(5, paciente.getMunicipio());
			statement.setString(6, paciente.getRg());
			statement.setString(7, paciente.getCpf());
			statement.setString(8, paciente.getSus());
			statement.setString(9, paciente.getRua());
			statement.setInt(10, paciente.getNumero_casa());
			statement.setString(11, paciente.getSexo());
			statement.setString(12, paciente.getQueixa());
			
			return statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Paciente buscarID(int id) throws ExceptionGeral {
		try {
            conexao = SQL_Connection.getConnectionInstance();
            statement = conexao.prepareStatement(SQLUtil.Paciente.SELECT_BY_ID);
            this.statement.setInt(1, id);
            result = this.statement.executeQuery();
            Paciente paciente;
            if (result.next()) {
                String nome = result.getString(1);
                String data = result.getString(2);
                String telefone = result.getString(3);
                String orgãoExpedidor = result.getString(4);
                String municipio = result.getString(5);
                String rg = result.getString(6);
                String cpf= result.getString(7);
                String sus = result.getString(8);
                String rua = result.getString(9);
                Integer numero = result.getInt(10);
                String sexo = result.getString(11);
                String queixa = result.getString(12);
                paciente = new Paciente(id);
                paciente.setNome(nome);
                paciente.setData_nascimento(data);
                paciente.setTelefone(telefone);
                paciente.setOrgExp(orgãoExpedidor);
                paciente.setMunicipio(municipio);
                paciente.setRg(rg);
                paciente.setCpf(cpf);
                paciente.setSus(sus);
                paciente.setRua(rua);
                paciente.setNumero_casa(numero);
                paciente.setSexo(sexo);
                paciente.setQueixa(queixa);
                return paciente;
            }
            throw new ExceptionGeral("ID INEXISTENTE");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: Paciente não encontrado.");
        }
	}

	@Override
	public ArrayList<Paciente> getAll() throws ExceptionGeral {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        try {
            conexao = SQL_Connection.getConnectionInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Paciente.SELECT_ALL);
            result = this.statement.executeQuery();
            Paciente paciente;
            while (result.next()) {
            	   String nome = result.getString(1);
                   String data = result.getString(2);
                   String telefone = result.getString(3);
                   String orgãoExpedidor = result.getString(4);
                   String municipio = result.getString(5);
                   String rg = result.getString(6);
                   String cpf= result.getString(7);
                   String sus = result.getString(8);
                   String rua = result.getString(9);
                   Integer numero = result.getInt(10);
                   String sexo = result.getString(11);
                   String queixa = result.getString(12);
                   paciente = new Paciente(nome, rua, telefone, orgãoExpedidor, municipio, cpf, rg, sus, sexo, queixa, data, numero);
                  
	               pacientes.add(paciente);
            }
            return pacientes;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: paciente não encontrado.");
        }
	
	}

}
