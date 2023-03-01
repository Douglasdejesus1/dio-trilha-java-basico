package metodos;

public class MinhaClasse {
	public static void main(String[] args) {

		SmartTv tv1 = new SmartTv(false, 0, 0);
		
		tv1.ligar();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.proximoCanal();
		tv1.proximoCanal();
		tv1.proximoCanal();
		System.out.println(tv1);
	
	}
}

