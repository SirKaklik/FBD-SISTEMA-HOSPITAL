package model.dao;

import java.awt.List;

import model.Auxiliares;

public interface IDAOAuxiliares {

	public boolean salvarEditar(Auxiliares aux);
	public Auxiliares buscarID(int id);
	public List getAll();
}
