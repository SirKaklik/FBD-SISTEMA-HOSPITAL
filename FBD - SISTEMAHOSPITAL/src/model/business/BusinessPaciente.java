package model.business;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Paciente;
import model.dao.DAOPaciente;
import model.dao.IDAOPaciente;

public class BusinessPaciente implements IBusinessPaciente{

	private IDAOPaciente daoPaciente;
	
	public BusinessPaciente() {
		super();
		this.daoPaciente = new DAOPaciente();
	}

	@Override
	public boolean salvarEditar(Paciente paciente) {
		return daoPaciente.salvarEditar(paciente);
	}

	@Override
	public Paciente buscarID(int id) throws ExceptionGeral {
		return daoPaciente.buscarID(id);
	}

	@Override
	public ArrayList<Paciente> getAll() throws ExceptionGeral {
		return daoPaciente.getAll();
	}

}
