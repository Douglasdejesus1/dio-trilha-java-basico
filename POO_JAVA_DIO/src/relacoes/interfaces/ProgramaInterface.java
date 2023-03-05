package relacoes.interfaces;

public class ProgramaInterface {
	public static void main(String[] args) {
		ImpressoraHp hp = new ImpressoraHp();
		
		ImpressoraCannon cn = new ImpressoraCannon();
		
		hp.imprimir();
		cn.imprimir();
		
	}

}
