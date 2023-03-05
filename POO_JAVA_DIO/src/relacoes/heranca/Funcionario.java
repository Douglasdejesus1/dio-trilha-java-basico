package relacoes.heranca;

public class Funcionario {
	private int id;
	private String nome;
	protected double pagamento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Funcionario() {
		
	}
	
	public double remunerar() {
		
		return  pagamento;		
	}

	
}
