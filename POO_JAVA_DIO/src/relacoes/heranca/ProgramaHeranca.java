package relacoes.heranca;

public class ProgramaHeranca {
	public static void main(String[] args) {
		
	
	//Vendedor vendedor1 = (Vendedor) new Funcionario();
	Funcionario funcionario1 = new Gerente(1,"Barbara",8200.0,"Contas");
	Funcionario funcionario2 = new Vendedor(1,"Carlos",13.5,200.0,1500.00,2000.00);
	Funcionario funcionario3 = new Faxineiro(1,"Antonio",13.5,100.0,"noturno");
	
	funcionario1.remunerar();
	funcionario2.remunerar();
	funcionario3.remunerar();
	System.out.println(funcionario1.pagamento);
	System.out.println(funcionario2.pagamento);
	System.out.println(funcionario3.pagamento);

	}
}
