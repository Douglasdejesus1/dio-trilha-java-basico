package relacoes.heranca;

public class Faxineiro extends Funcionario{
	private double salarioHora;
	private double cargaHoraria;
	private String turno;

	
	
public Faxineiro(int id, String nome, double salarioHora, double cargaHoraria, String turno) {
		super(id, nome);
		this.salarioHora = salarioHora;
		this.cargaHoraria = cargaHoraria;
		this.turno = turno;
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



public String getTurno() {
	return turno;
}



public void setTurno(String turno) {
	this.turno = turno;
}



public double remunerar() {
		
	if(turno.equals("noturno")) {
		pagamento = (salarioHora*cargaHoraria)*1.2;
	}else {
		pagamento = salarioHora*cargaHoraria;
	}
	
		return  pagamento;		
	}
}
