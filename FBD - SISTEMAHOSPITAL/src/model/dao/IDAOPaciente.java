package model.dao;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Paciente;

public interface IDAOPaciente {
	
	public boolean salvarEditar(Paciente paciente);
	public Paciente buscarID(int id) throws ExceptionGeral;
	public ArrayList<Paciente> getAll() throws ExceptionGeral;
}
