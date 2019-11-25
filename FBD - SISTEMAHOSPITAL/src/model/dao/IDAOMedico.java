package model.dao;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Laudo;
import model.Medico;


public interface IDAOMedico {

	public boolean salvarEditar(Medico medico);
	public Medico buscarID(int id) throws ExceptionGeral;
	public ArrayList<Medico> getAll() throws ExceptionGeral;
}
