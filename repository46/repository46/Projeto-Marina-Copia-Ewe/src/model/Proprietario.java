package model;

public class Proprietario {
	
	private String nomeProprietario;
	private String foneProprietario;
	private String cpfProprietario;
	
	public Proprietario(String nome, String fone, String cpf) {
		this.nomeProprietario = nome;
		this.foneProprietario = fone;
		this.setCpfProprietario(cpf);
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getFoneProprietario() {
		return foneProprietario;
	}
	public void setFoneProprietario(String foneProprietario) {
		this.foneProprietario = foneProprietario;
	}

	public String getCpfProprietario() {
		return cpfProprietario;
	}

	public void setCpfProprietario(String cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

}
