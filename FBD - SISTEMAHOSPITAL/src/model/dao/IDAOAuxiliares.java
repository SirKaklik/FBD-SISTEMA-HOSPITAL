package model.dao;

import java.awt.List;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Auxiliares;

public interface IDAOAuxiliares {

	public boolean salvarEditar(Auxiliares aux);
	public Auxiliares buscarID(int id) throws ExceptionGeral;
	public ArrayList<Auxiliares> getAll() throws ExceptionGeral;

}
