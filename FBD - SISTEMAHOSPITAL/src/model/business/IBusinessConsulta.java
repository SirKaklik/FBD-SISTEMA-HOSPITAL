package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Consulta;

public interface IBusinessConsulta {
	
	public boolean salvarEditar(Consulta consulta);
	public Consulta buscarID(int id) throws ExceptionGeral;
	public ArrayList<Consulta> getAll() throws ExceptionGeral;
}
