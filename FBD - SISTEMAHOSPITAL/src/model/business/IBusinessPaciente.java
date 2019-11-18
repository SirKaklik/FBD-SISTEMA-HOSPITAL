package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Paciente;

public interface IBusinessPaciente {
	
	public boolean salvarEditar(Paciente paciente);
	public Paciente buscarID(int id) throws ExceptionGeral;
	public ArrayList<Paciente> getAll() throws ExceptionGeral;
}
