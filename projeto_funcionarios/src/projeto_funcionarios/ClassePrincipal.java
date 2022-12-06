package projeto_funcionarios;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseFuncionarios parametrofuncionarios = new ClasseFuncionarios();
		//pessoa.setAtributoIdPessoa(1);
		parametrofuncionarios.setAtributoNomeFuncionario("Gabrielle");
		parametrofuncionarios.setAtributoSalarioFuncionario(2.5);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(parametrofuncionarios);


	}

}
