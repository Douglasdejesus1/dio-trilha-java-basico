package relacoes.heranca;

public class Gerente extends Funcionario {

	private double bonus;
	private String setor;
	
	
public Gerente(int id, String nome, double bonus, String setor) {
		super(id, nome);
		this.bonus = bonus;
		this.setor = setor;
	}


public double getBonus() {
	return bonus;
}


public void setBonus(double bonus) {
	this.bonus = bonus;
}


public String getSetor() {
	return setor;
}


public void setSetor(String setor) {
	this.setor = setor;
}


public double remunerar() {
		pagamento = bonus;
		return  pagamento;		
	}
	
}
