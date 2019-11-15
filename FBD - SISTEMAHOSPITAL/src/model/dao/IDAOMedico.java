package model.dao;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Medico;


public interface IDAOMedico {

	public boolean salvarEditar(Medico medico);
	public Medico buscarID(int id) throws ExceptionGeral;
}
