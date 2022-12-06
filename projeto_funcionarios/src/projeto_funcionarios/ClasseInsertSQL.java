package projeto_funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClasseInsertSQL {
	
	public void salvarDados(ClasseFuncionarios parametrofuncionarios) {	
		
		String insert_sql = "INSERT INTO tabela_funcionarios (id, nome, salario) VALUES(default, ?, ?)";
		Connection acesso = null;
		PreparedStatement preparar = null;
	
		try {
			acesso = ClasseDadosConexao.criarConexao();
			preparar = acesso.prepareStatement(insert_sql);
			preparar.setString(1, parametrofuncionarios.getAtributoNomeFuncionario());
			preparar.setDouble(2, parametrofuncionarios.getAtributoSalarioFuncionario());
			preparar.execute();
		}
		catch(Exception e) {
			System.out.println("Erro ao acessar o banco!" + e);
		}
		
		finally {
			try {
				if(preparar != null) {
					preparar.close();
				}
				if(acesso != null) {
					acesso.close();
				}
			}
			catch(Exception e) {
				System.out.println("Fim");
			}
		}
	}
}