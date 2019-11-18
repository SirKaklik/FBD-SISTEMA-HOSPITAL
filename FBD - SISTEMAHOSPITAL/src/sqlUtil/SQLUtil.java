package sqlUtil;

import java.sql.Date;

public class SQLUtil {

	public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/postgres";
	public static String USUARIO_POSTGRES = "postgres";
	public static String SENHA_POSTGRES = "123";
	
	public static class Paciente{
		private static String NOME_TABELA = "paciente";
		private static String COL_NOME = "nome";
		private static String COL_CPF = "cpf";
		private static String COL_RG = "rg";
		private static String COL_RUA = "rua";
		private static String COL_NUMERO = "numero";
		private static String COL_MUNICIPIO = "municipio";
		private static String COL_TELEFONE = "telefone";
		private static String COL_SEXO = "sexo";
		private static String COL_DATA_NASCIMENTO = "datanascimento";
		private static String COL_ORG_EXP = "orgaoexpedidor";
		private static String COL_SUS = "sus";
		private static String COL_QUEIXA = "queixa"; 
			
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+ COL_NOME + "," +COL_DATA_NASCIMENTO+ "," +COL_TELEFONE+ "," +COL_ORG_EXP+
				"," +COL_MUNICIPIO+ "," +COL_RG+ ","+COL_CPF+ "," +COL_SUS+ "," +COL_RUA+ "," +COL_NUMERO+ 
				"," +COL_SEXO+  "," +COL_QUEIXA+") values (?,?,?,?,?,?,?,?,?,?,?,?)";
		
	    public static String SELECT_BY_ID =  "SELECT paciente.nome, paciente.datanascimento, paciente.telefone,paciente.orgaoexpedidor,"
	    		+ "paciente.municipio, paciente.rg, paciente.cpf, paciente.sus, paciente.rua, paciente.numero, "
	    		+ "paciente.sexo, paciente.queixa FROM "+
	                NOME_TABELA+" paciente WHERE ID = ?";
	    
	    public static String SELECT_ALL =  "SELECT p.nome, p.cpf, p.rg, p.rua, p.numero, p.municipio, p.telefone, p.sexo, p.datanascimento,"
	    	    		+ "p.orgaoexpedidor, p.sus, p.queixa FROM "+ NOME_TABELA+" as p;";
	}
	
	public static class Consulta{
		private static String NOME_TABELA = "consulta";
		private static String COL_TIPO = "tipo";
		private static String COL_ID_PACIENTE = "id_paciente";
		
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+ COL_TIPO + "," +COL_ID_PACIENTE+ ") values (?,?)";
		
	    public static String SELECT_BY_ID =  "SELECT consulta.tipo, consulta.id_paciente FROM "+
	                NOME_TABELA+" consulta WHERE ID = ?";
	    
	    public static String SELECT_ALL =  "SELECT a.tipo, a.id_paciente FROM "+
                NOME_TABELA+" as a;";
	}
	
	public static class Atendente{
		private static String NOME_TABELA = "atendente";
		private static String COL_NOME = "nome";
		private static String COL_CPF = "cpf";
		private static String COL_RG = "rg";
		
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+COL_CPF+ "," +COL_RG+ "," + COL_NOME + ") values (?,?,?)";
		
	    public static String SELECT_BY_ID =  "SELECT atendente.cpf, atendente.rg, atendente.nome FROM "+
	                NOME_TABELA+" atendente WHERE ID = ?";
	    public static String SELECT_ALL =  "SELECT a. nome, a.cpf, a.rg FROM "+
                NOME_TABELA+" as a;";
	}
	
	public static class Auxiliares{
		private static String NOME_TABELA = "auxiliares";
		private static String COL_NOME = "nome";
		private static String COL_CPF = "cpf";
		private static String COL_RG = "rg";
		
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+COL_CPF+ "," +COL_RG+ "," + COL_NOME + ") values (?,?,?)";
		
		public static String SELECT_BY_ID =  "SELECT auxiliares.cpf, auxiliares.rg, auxiliares.nome FROM "+
                NOME_TABELA+" auxiliares WHERE ID = ?";
	    
	    public static String SELECT_ALL =  "SELECT a. nome, a.cpf, a.rg FROM "+
                NOME_TABELA+" as a;";
	}
	
	
	public static class Medico{
		private static String NOME_TABELA = "medico";
		private static String COL_NOME = "nome";
		private static String COL_ESPECIALIDADE = "especialidade";
		private static String COL_TELEFONE = "telefone";
		
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+COL_NOME+ "," +COL_ESPECIALIDADE+ "," + COL_TELEFONE+ ") values (?,?,?)";
		
	    public static String SELECT_BY_ID =  "SELECT medico.nome, medico.especialidade, medico.telefone FROM "+
	                NOME_TABELA+" medico WHERE ID = ?";
	    public static String SELECT_ALL =  "SELECT a. nome, a.especialidade, a.telefone FROM "+
                NOME_TABELA+" as a;";
	}
	
}
