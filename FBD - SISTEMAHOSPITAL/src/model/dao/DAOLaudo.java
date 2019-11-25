package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Laudo;
import model.Medico;
import sqlUtil.SQLUtil;
import sqlUtil.SQL_Connection;

public class DAOLaudo implements IDAOLaudo{
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;

	@Override
	public boolean salvarEditar(Laudo laudo) {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Laudo.INSERT_ALL);
			statement.setString(1, laudo.getLaudo());
		
			return statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Laudo buscarID(int id) throws ExceptionGeral {
		try {
            conexao = SQL_Connection.getConnectionInstance();
            statement = conexao.prepareStatement(SQLUtil.Laudo.SELECT_BY_ID);
            this.statement.setInt(1, id);
            result = this.statement.executeQuery();
            Laudo laudo;
            if (result.next()) {
                String laudoTxt = result.getString(1);
                laudo= new Laudo(id);
                laudo.setLaudo(laudoTxt);      
             
                return laudo;
            }
            throw new ExceptionGeral("ID INEXISTENTE");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: laudo não encontrado.");
        }
	}

	@Override
	public ArrayList<Laudo> getAll() throws ExceptionGeral {
		ArrayList<Laudo> laudos = new ArrayList<Laudo>();
        try {
            conexao = SQL_Connection.getConnectionInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Laudo.SELECT_ALL);
            result = this.statement.executeQuery();
            Laudo laudo;
            while (result.next()) {
            	   String laudoTxt = result.getString(1);
	                laudo = new Laudo(laudoTxt);
	                laudos.add(laudo);
            }
            return laudos;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: laudo não encontrado.");
        }
	}

}
