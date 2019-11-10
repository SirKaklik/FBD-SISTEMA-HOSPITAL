package model.dao;

import java.awt.List;
import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;

public interface IDAOAtendente {

	public boolean salvarEditar(Atendente atendente);
	public Atendente buscarID(int id) throws ExceptionGeral;
	public ArrayList<Atendente> getAll() throws ExceptionGeral;
	
	
}
