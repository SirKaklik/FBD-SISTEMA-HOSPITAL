package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Laudo;

public interface IBusinessLaudo {
	public boolean salvarEditar(Laudo laudo);
	public Laudo buscarID(int id) throws ExceptionGeral;
	public ArrayList<Laudo> getAll() throws ExceptionGeral;
}
