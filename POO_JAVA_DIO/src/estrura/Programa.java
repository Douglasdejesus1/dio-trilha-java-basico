package estrura;

public class Programa {
public static void main(String[] args) {
	
	Carro c1 = new Carro();
	
	c1.setVelocidade(8.0);
	System.out.println(c1.getVelocidade());
	c1.frear();
	System.out.println(c1.getVelocidade());
	c1.frear(5);
	System.out.println(c1.getVelocidade());
	
	
	
}
}
