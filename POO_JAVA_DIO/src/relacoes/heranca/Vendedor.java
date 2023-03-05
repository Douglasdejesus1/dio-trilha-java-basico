package relacoes.heranca;

public class Vendedor extends Funcionario{
	private double salarioHora;
	private double cargaHoraria;
	private double comissao;
	private double meta;
	
	
public Vendedor(int id, String nome, double salarioHora, double cargaHoraria, double comissao, double meta) {
		super(id, nome);
		this.salarioHora = salarioHora;
		this.cargaHoraria = cargaHoraria;
		this.comissao = comissao;
		this.meta = meta;
	}



public double getSalarioHora() {
	return salarioHora;
}



public void setSalarioHora(double salarioHora) {
	this.salarioHora = salarioHora;
}



public double getCargaHoraria() {
	return cargaHoraria;
}



public void setCargaHoraria(double cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}



public double getComissao() {
	return comissao;
}



public void setComissao(double comissao) {
	this.comissao = comissao;
}



public double getMeta() {
	return meta;
}



public void setMeta(double meta) {
	this.meta = meta;
}



public double remunerar() {
	pagamento =comissao+(salarioHora*cargaHoraria);	
	
		return  pagamento;		
	}
}
