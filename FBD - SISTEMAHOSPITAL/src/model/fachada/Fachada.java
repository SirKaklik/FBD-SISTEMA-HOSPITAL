package model.fachada;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Auxiliares;
import model.Consulta;
import model.Laudo;
import model.Medico;
import model.Paciente;
import model.business.BusinessAtendente;
import model.business.BusinessAuxiliares;
import model.business.BusinessConsulta;
import model.business.BusinessLaudo;
import model.business.BusinessMedico;
import model.business.BusinessPaciente;
import model.business.IBusinessAtendente;
import model.business.IBusinessAuxiliares;
import model.business.IBusinessConsulta;
import model.business.IBusinessLaudo;
import model.business.IBusinessMedico;
import model.business.IBusinessPaciente;

public class Fachada implements IFachada{

	private IBusinessAtendente businessAtendente;
	private IBusinessAuxiliares businessAux;
	private IBusinessConsulta businessConsulta;
	private IBusinessMedico businessMedico;
	private IBusinessPaciente businessPaciente;
	private IBusinessLaudo businessLaudo;
	
	private static Fachada instance;
	
	private Fachada() {
		businessAtendente = new BusinessAtendente();
		businessAux = new BusinessAuxiliares();
		businessConsulta = new BusinessConsulta();
		businessMedico = new BusinessMedico();
		businessPaciente = new BusinessPaciente();
		businessLaudo = new BusinessLaudo();
	}
	
	public static Fachada getInstance() {
		if(instance == null) {
			instance = new Fachada();
		}
		return instance;
		
	}
	
	
	@Override
	public boolean salvarEditarAtendente(Atendente atendente) throws ExceptionGeral {
		return businessAtendente.salvarEditar(atendente);
	}

	@Override
	public Atendente buscarIDAtendente(int id) throws ExceptionGeral {
		return businessAtendente.buscarID(id);
	}

	@Override
	public ArrayList<Atendente> getAllAtendente() throws ExceptionGeral {
		return businessAtendente.getAll();
	}

	@Override
	public boolean salvarEditarAuxiliares(Auxiliares aux) {
		return businessAux.salvarEditar(aux);
	}

	@Override
	public Auxiliares buscarIDAuxiliares(int id) throws ExceptionGeral {
		return businessAux.buscarID(id);
	}

	@Override
	public ArrayList<Auxiliares> getAllAuxiliares() throws ExceptionGeral {
		return businessAux.getAll();
	}

	@Override
	public boolean salvarEditarConsulta(Consulta consulta) {
		return businessConsulta.salvarEditar(consulta);
	}

	@Override
	public Consulta buscarIDConsulta(int id) throws ExceptionGeral {
		return businessConsulta.buscarID(id);
	}

	@Override
	public ArrayList<Consulta> getAllConsulta() throws ExceptionGeral {
		return businessConsulta.getAll();
	}

	@Override
	public boolean salvarEditarMedico(Medico medico) {
		return businessMedico.salvarEditar(medico);
	}

	@Override
	public Medico buscarIDMedico(int id) throws ExceptionGeral {
		return businessMedico.buscarID(id);
	}

	@Override
	public boolean salvarEditarPaciente(Paciente paciente) {
		return businessPaciente.salvarEditar(paciente);
	}

	@Override
	public Paciente buscarIDPaciente(int id) throws ExceptionGeral {
		return businessPaciente.buscarID(id);
	}

	@Override
	public ArrayList<Paciente> getAllPaciente() throws ExceptionGeral {
		return businessPaciente.getAll();
	}

	@Override
	public boolean salvarEditarLaudo(Laudo laudo) {
		return businessLaudo.salvarEditar(laudo);
	}

	@Override
	public Laudo buscarIDLaudo(int id) throws ExceptionGeral {
		return businessLaudo.buscarID(id);
	}

	@Override
	public ArrayList<Laudo> getAllLaudo() throws ExceptionGeral {
		return businessLaudo.getAll();
	}

	@Override
	public ArrayList<Medico> getAllMedico() throws ExceptionGeral {
		return businessMedico.getAll();
	}

}
