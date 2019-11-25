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

public class DAOMedico implements IDAOMedico{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;

	public boolean salvarEditar(Medico medico) {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Medico.INSERT_ALL);
			statement.setString(1, medico.getNome());
			statement.setString(2, medico.getEspecialidade());
			statement.setString(3, medico.getTelefone());

			return statement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Medico buscarID(int id) throws ExceptionGeral {
		try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement(SQLUtil.Medico.SELECT_BY_ID);
			this.statement.setInt(1, id);
			result = this.statement.executeQuery();
			Medico medico;
			if (result.next()) {
				String telefone = result.getString(3);
				String especialidade = result.getString(2);
				String nome = result.getString(1);
				medico = new Medico(id);
				medico.setNome(nome);
				medico.setEspecialidade(especialidade);
				medico.setTelefone(telefone);
				return medico;
			}
			throw new ExceptionGeral("ID INEXISTENTE");
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionGeral("Erro: funcionario não encontrado.");
		}
	}

	@Override
	public ArrayList<Medico> getAll() throws ExceptionGeral {
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		try {
			conexao = SQL_Connection.getConnectionInstance();
			this.statement = conexao.prepareStatement(SQLUtil.Medico.SELECT_ALL);
			result = this.statement.executeQuery();
			Medico medico;
			while (result.next()) {
				String telefone = result.getString(3);
				String especialidade = result.getString(2);
				String nome = result.getString(1);
				medico = new Medico(especialidade, telefone, nome);
				medicos.add(medico);
			}
			return medicos;

		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionGeral("Erro: medico não encontrado.");
		}
	}




}
