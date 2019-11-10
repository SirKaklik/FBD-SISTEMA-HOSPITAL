package model.dao;

import java.awt.List;

import model.Atendente;
import model.Triagem;

public interface IDAOTriagem {
	public boolean salvarEditar(Triagem triagem);
	public Triagem buscarID(int id);
	public List getAll();
}
