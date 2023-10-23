package model;

public class Morador {

	private String nomeMorador;
	private String foneMorador;
	private String cpfMorador;
	
	public Morador(String nome, String fone, String cpf) {
		this.nomeMorador = nome;
		this.foneMorador = fone;
		this.setCpfMorador(cpf);
	}
	
	public String getNomeMorador() {
		return nomeMorador;
	}
	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}
	public String getFoneMorador() {
		return foneMorador;
	}
	public void setFoneMorador(String foneMorador) {
		this.foneMorador = foneMorador;
	}

	public String getCpfMorador() {
		return cpfMorador;
	}

	public void setCpfMorador(String cpfMorador) {
		this.cpfMorador = cpfMorador;
	}
}
