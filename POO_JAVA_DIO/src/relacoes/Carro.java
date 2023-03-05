package relacoes;

public class Carro extends Veiculo{

	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private double velocidade;
	
	
	
	public Carro(String modelo, String marca, String cor, int ano, double velocidade) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.velocidade = velocidade;
	}




	public Carro() {
		super();
	}

	


	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public double getVelocidade() {
		return velocidade;
	}



	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}



	public void frear() {
		this.velocidade--;
	}
	public void frear(double diminuição) {
		this.velocidade= velocidade-diminuição;
	}
	
}
