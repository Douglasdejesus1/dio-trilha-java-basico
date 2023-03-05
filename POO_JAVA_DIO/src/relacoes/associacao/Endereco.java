package relacoes.associacao;

public class Endereco {
	private String nomeRua;
	private String cep;
	public Endereco(String nomeRua, String cep) {
		super();
		this.nomeRua = nomeRua;
		this.cep = cep;
	}
	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Endereco [nomeRua=" + nomeRua + ", cep=" + cep + "]";
	}
	

}
