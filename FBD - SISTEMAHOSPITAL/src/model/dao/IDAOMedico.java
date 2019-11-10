package model.dao;

import java.awt.List;

import model.Medico;


public interface IDAOMedico {

	public boolean salvarEditar(Medico medico);
	public Medico buscarID(int id);
	public List getAll();
}
