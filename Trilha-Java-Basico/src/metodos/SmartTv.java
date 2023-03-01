package metodos;

public class SmartTv {

	private boolean ligada;
	private int canal;
	private int volume;
	
	public SmartTv(boolean ligada, int canal, int volume) {
		super();
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "SmartTv [ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + "]";
	}
	public void ligar() {
		 this.ligada =true;
	}
	public void desligar() {
		 this.ligada =false;
	}
	public void aumentarVolume() {
		 this.volume++;
	}
	public void diminuirVolume() {
		 this.volume--;
	}
	public void proximoCanal() {
		 this.canal++;
	}
	public void CanalAnterio() {
		 this.canal--;
	}
	
	
	
	
}
