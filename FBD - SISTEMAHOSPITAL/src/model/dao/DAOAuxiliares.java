package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Auxiliares;
import sqlUtil.SQLUtil;
import sqlUtil.SQL_Connection;

public class DAOAuxiliares implements IDAOAuxiliares{
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	
	@Override
	public boolean salvarEditar(Auxiliares aux) {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Auxiliares.INSERT_ALL);
			statement.setString(1, aux.getCpf());
			statement.setString(2, aux.getRg());
			statement.setString(3, aux.getNome());
			
			return statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	
	}
	@Override
	public Auxiliares buscarID(int id) throws ExceptionGeral {
		 try {
	            conexao = SQL_Connection.getConnectionInstance();
	            statement = conexao.prepareStatement(SQLUtil.Auxiliares.SELECT_BY_ID);
	            this.statement.setInt(1, id);
	            result = this.statement.executeQuery();
	            Auxiliares aux;
	            if (result.next()) {
	                String nome = result.getString(3);
	                String rg = result.getString(2);
	                String cpf = result.getString(1);
	                aux = new Auxiliares(id);
	                aux.setNome(nome);
	                aux.setCpf(cpf);
	                aux.setRg(rg);
	                return aux;
	            }
	            throw new ExceptionGeral("ID INEXISTENTE");
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new ExceptionGeral("Erro: Funcionario não encontrado.");
	        }
	}
	@Override
	public ArrayList<Auxiliares> getAll() throws ExceptionGeral {
		ArrayList<Auxiliares> auxiliares= new ArrayList<Auxiliares>();
        try {
            conexao = SQL_Connection.getConnectionInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Auxiliares.SELECT_ALL);
            result = this.statement.executeQuery();
            Auxiliares aux;
            while (result.next()) {
            	   String nome = result.getString(3);
	                String rg = result.getString(2);
	                String cpf = result.getString(1);
	                aux = new Auxiliares(cpf, rg, nome);
	                auxiliares.add(aux);
            }
            return auxiliares;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: funcionario não encontrado.");
        }
	}
	
	
	
}
