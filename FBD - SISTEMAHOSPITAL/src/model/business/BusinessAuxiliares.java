package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Auxiliares;
import model.dao.DAOAuxiliares;
import model.dao.IDAOAuxiliares;

public class BusinessAuxiliares implements IBusinessAuxiliares {

	private IDAOAuxiliares daoAux;
	
	public BusinessAuxiliares() {
		super();
		this.daoAux = new DAOAuxiliares();
	}

	public boolean salvarEditar(Auxiliares aux) {
		return daoAux.salvarEditar(aux);
	}

	public Auxiliares buscarID(int id) throws ExceptionGeral {
		return daoAux.buscarID(id);
	}

	public ArrayList<Auxiliares> getAll() throws ExceptionGeral {
		return daoAux.getAll();
	}

	
	
}
