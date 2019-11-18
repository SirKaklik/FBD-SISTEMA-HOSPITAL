package model.business;

import exceptions.ExceptionGeral;
import model.Medico;

public interface IBusinessMedico {

	public boolean salvarEditar(Medico medico);
	public Medico buscarID(int id) throws ExceptionGeral;
}
