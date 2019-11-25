package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Laudo;
import model.dao.DAOLaudo;
import model.dao.IDAOLaudo;

public class BusinessLaudo implements IBusinessLaudo{

	private IDAOLaudo daoLaudo;
	
	
	public BusinessLaudo() {
		super();
		this.daoLaudo = new DAOLaudo();
	}

	@Override
	public boolean salvarEditar(Laudo laudo) {
		return daoLaudo.salvarEditar(laudo);
	}

	@Override
	public Laudo buscarID(int id) throws ExceptionGeral {
		return daoLaudo.buscarID(id);
	}

	@Override
	public ArrayList<Laudo> getAll() throws ExceptionGeral {
		return daoLaudo.getAll();
	}

}
