package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Consulta;
import model.dao.DAOConsulta;
import model.dao.IDAOConsulta;

public class BusinessConsulta implements IBusinessConsulta{

	private IDAOConsulta daoConsulta;
	
	
	
	public BusinessConsulta() {
		super();
		this.daoConsulta = new DAOConsulta();
	}


	public boolean salvarEditar(Consulta consulta) {
		return daoConsulta.salvarEditar(consulta);
	}

	
	public Consulta buscarID(int id) throws ExceptionGeral {
		return daoConsulta.buscarID(id);
	}

	
	public ArrayList<Consulta> getAll() throws ExceptionGeral {
		return daoConsulta.getAll();
	}
	

}
