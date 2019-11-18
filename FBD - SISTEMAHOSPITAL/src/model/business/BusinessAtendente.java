package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.dao.DAOAtendente;
import model.dao.IDAOAtendente;

public class BusinessAtendente implements IBusinessAtendente{

	private IDAOAtendente daoAtendente;
	
	
	public BusinessAtendente() {
		this.daoAtendente = new DAOAtendente();
	}

	public boolean salvarEditar(Atendente atendente) {
	    return daoAtendente.salvarEditar(atendente);
	       
	}

	@Override
	public Atendente buscarID(int id) throws ExceptionGeral {
		return daoAtendente.buscarID(id);
	}

	@Override
	public ArrayList<Atendente> getAll() throws ExceptionGeral {
		return daoAtendente.getAll();
	}

}
