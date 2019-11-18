package model.business;

import exceptions.ExceptionGeral;
import model.Medico;
import model.dao.DAOMedico;
import model.dao.IDAOMedico;

public class BusinessMedico implements IBusinessMedico{

	private IDAOMedico daoMedico;
	
	public BusinessMedico() {
		super();
		this.daoMedico = new DAOMedico();
	}

	@Override
	public boolean salvarEditar(Medico medico) {
		return daoMedico.salvarEditar(medico);
	}

	@Override
	public Medico buscarID(int id) throws ExceptionGeral {
		return daoMedico.buscarID(id);
	}

}
