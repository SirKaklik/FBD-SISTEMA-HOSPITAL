package model.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import sqlUtil.SQLUtil;
import sqlUtil.SQL_Connection;

public class DAOAtendente implements IDAOAtendente{
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	
	@Override
	public boolean salvarEditar(Atendente atendente) {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Atendente.INSERT_ALL);
			statement.setString(1, atendente.getCpf());
			statement.setString(2, atendente.getRg());
			statement.setString(3, atendente.getNome());
			
			return statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Atendente buscarID(int id) throws ExceptionGeral {
		 try {
	            conexao = SQL_Connection.getConnectionInstance();
	            statement = conexao.prepareStatement(SQLUtil.Atendente.SELECT_BY_ID);
	            this.statement.setInt(1, id);
	            result = this.statement.executeQuery();
	            Atendente atendente;
	            if (result.next()) {
	                String nome = result.getString(3);
	                String rg = result.getString(2);
	                String cpf = result.getString(1);
	                atendente = new Atendente(id);
	                atendente.setNome(nome);
	                atendente.setCpf(cpf);
	                atendente.setRg(rg);
	                return atendente;
	            }
	            throw new ExceptionGeral("ID INEXISTENTE");
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new ExceptionGeral("Erro: funcionario não encontrado.");
	        }
	}

	@Override
	public ArrayList<Atendente> getAll() throws ExceptionGeral {
		ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
        try {
            conexao = SQL_Connection.getConnectionInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Atendente.SELECT_ALL);
            result = this.statement.executeQuery();
            Atendente atendente;
            while (result.next()) {
            	   String nome = result.getString(3);
	                String rg = result.getString(2);
	                String cpf = result.getString(1);
	                atendente = new Atendente(cpf, rg, nome);
	                atendentes.add(atendente);
            }
            return atendentes;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: funcionario não encontrado.");
        }
	}

}
