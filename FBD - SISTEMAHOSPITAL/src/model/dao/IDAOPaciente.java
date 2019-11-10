package model.dao;

import java.awt.List;

import model.Atendente;
import model.Paciente;

public interface IDAOPaciente {
	
	public boolean salvarEditar(Paciente paciente);
	public Paciente buscarID(int id);
	public List getAll();
}
