package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Consulta;
import sqlUtil.SQLUtil;
import sqlUtil.SQL_Connection;

public class DAOConsulta implements IDAOConsulta{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	
	@Override
	public boolean salvarEditar(Consulta consulta) {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Consulta.INSERT_ALL);
			statement.setString(1, consulta.getTipo());
			statement.setString(2, consulta.getId_paciente());
			
			return statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	
	}

	@Override
	public Consulta buscarID(int id) throws ExceptionGeral {
		try {
            conexao = SQL_Connection.getConnectionInstance();
            statement = conexao.prepareStatement(SQLUtil.Consulta.SELECT_BY_ID);
            this.statement.setInt(1, id);
            result = this.statement.executeQuery();
            Consulta consulta;
            if (result.next()) {
            	String tipo = result.getString(1);
            	String id_paciente = result.getString(2);
                consulta = new Consulta(id);
                consulta.setTipo(tipo);
                consulta.setId_paciente(id_paciente);
                return consulta;
            }
            throw new ExceptionGeral("ID INEXISTENTE");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: consulta não encontrado.");
        }
	}

	@Override
	public ArrayList<Consulta> getAll() throws ExceptionGeral {
		ArrayList<Consulta> consultas = new ArrayList<Consulta>();
        try {
            conexao = SQL_Connection.getConnectionInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Consulta.SELECT_ALL);
            result = this.statement.executeQuery();
            Consulta consulta;
            while (result.next()) {
	                String id_paciente = result.getString(2);
	                String tipo = result.getString(1);
	                consulta = new Consulta(tipo, id_paciente);
	                consultas.add(consulta);
            }
            return consultas;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionGeral("Erro: consulta não encontrada.");
        }
	}
	
	}


