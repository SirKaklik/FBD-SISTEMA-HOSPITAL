package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Auxiliares;

public interface IBusinessAuxiliares {

	public boolean salvarEditar(Auxiliares aux);
	public Auxiliares buscarID(int id) throws ExceptionGeral;
	public ArrayList<Auxiliares> getAll() throws ExceptionGeral;
}
