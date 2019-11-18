package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;

public interface IBusinessAtendente {
	public boolean salvarEditar(Atendente atendente) throws ExceptionGeral;
	public Atendente buscarID(int id) throws ExceptionGeral;
	public ArrayList<Atendente> getAll() throws ExceptionGeral;
}
