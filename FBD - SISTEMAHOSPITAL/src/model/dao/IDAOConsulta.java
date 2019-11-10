package model.dao;

import java.awt.List;

import model.Atendente;
import model.Consulta;

public interface IDAOConsulta {
	public boolean salvarEditar(Consulta consulta);
	public Consulta buscarID(int id);
	public List getAll();
}
