package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Medico;

public interface IBusinessMedico {

	public boolean salvarEditar(Medico medico);
	public Medico buscarID(int id) throws ExceptionGeral;
	public ArrayList<Medico> getAll() throws ExceptionGeral;
}
