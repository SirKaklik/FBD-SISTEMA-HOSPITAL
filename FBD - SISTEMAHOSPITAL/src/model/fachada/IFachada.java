package model.fachada;

import java.util.ArrayList;

import exceptions.ExceptionGeral;
import model.Atendente;
import model.Auxiliares;
import model.Consulta;
import model.Laudo;
import model.Medico;
import model.Paciente;

public interface IFachada {

	//Atendente
	
	public boolean salvarEditarAtendente(Atendente atendente) throws ExceptionGeral;
	public Atendente buscarIDAtendente(int id) throws ExceptionGeral;
	public ArrayList<Atendente> getAllAtendente() throws ExceptionGeral;
	
	//Auxiliares
	
	public boolean salvarEditarAuxiliares(Auxiliares aux);
	public Auxiliares buscarIDAuxiliares(int id) throws ExceptionGeral;
	public ArrayList<Auxiliares> getAllAuxiliares() throws ExceptionGeral;
	
	//Consulta
	
	public boolean salvarEditarConsulta(Consulta consulta);
	public Consulta buscarIDConsulta(int id) throws ExceptionGeral;
	public ArrayList<Consulta> getAllConsulta() throws ExceptionGeral;
	
	//Medico
	
	public boolean salvarEditarMedico(Medico medico);
	public Medico buscarIDMedico(int id) throws ExceptionGeral;
	public ArrayList<Medico> getAllMedico() throws ExceptionGeral;
	
	//Paciente
	
	public boolean salvarEditarPaciente(Paciente paciente);
	public Paciente buscarIDPaciente(int id) throws ExceptionGeral;
	public ArrayList<Paciente> getAllPaciente() throws ExceptionGeral;
	
	//Laudo
	public boolean salvarEditarLaudo(Laudo laudo);
	public Laudo buscarIDLaudo(int id) throws ExceptionGeral;
	public ArrayList<Laudo> getAllLaudo() throws ExceptionGeral;
	
}

