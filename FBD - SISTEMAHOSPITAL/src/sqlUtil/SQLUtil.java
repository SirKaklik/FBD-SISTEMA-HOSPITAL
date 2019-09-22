package sqlUtil;

public class SQLUtil {

	public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/SistemaHospital";
	public static String USUARIO_POSTGRES = "postgres";
	public static String SENHA_POSTGRES = "123";
	
	public static class Paciente{
		private static String NOME_TABELA = "aluno";
		private static String COL_NOME = "nome";
		private static String COL_CPF = "cpf";
		
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+ COL_NOME + "," +COL_CPF+ ") values (?,?)";
	}
	
	public static class Consulta{

	}
	
	public static class Atendente{

	}
	
	public static class Auxiliares{

	}
	
	public static class Cirurgia{

	}
	
	public static class Farmaceutico{

	}
	
	public static class Farmacia{

	}
	
	public static class Medicamento{

	}
	
	public static class FichaPaciente{

	}
	
	public static class Garagem{

	}
	
	public static class Transferencia{

	}
	
	public static class Hospital{

	}
	
	public static class Laboratorio{

	}
	
	public static class Medico{

	}
	
	public static class Plantao{

	}
	
	public static class Aluno{

	}
	
	public static class Prefeitura{

	}
	
	public static class SalaCirurgia{

	}
	
	public static class Triagem{

	}
}
