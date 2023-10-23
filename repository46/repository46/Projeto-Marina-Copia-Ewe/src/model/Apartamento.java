package model;

public class Apartamento {
	
	private int qtdeQuartos;
	private String numApt;
	private String tipoOcupacao;
	private Proprietario cpfProp;
	public SetDespApto set;
	
	
	public Apartamento(int qtdeQuartos, String numApt, String tipoOcupacao) { //Inserir os dados do Apartamento
		this.qtdeQuartos = qtdeQuartos;
		this.numApt = numApt;
		this.tipoOcupacao = tipoOcupacao;
		
	}
	
	public String getNumApt() {
		return numApt;
	}

	public void setNumApt(String numApt) {
		this.numApt = numApt;
	}

	public String getTipoOcupacao() {
		return tipoOcupacao;
	}

	public void setTipoOcupacao(String tipoOcupacao) {
		this.tipoOcupacao = tipoOcupacao;
	}

	public void setQtdeQuartos(int qtdeQuartos) {
		this.qtdeQuartos = qtdeQuartos;
	}

	public void setCpfProp(Proprietario cpfProp) {
		this.cpfProp = cpfProp;
	}
	
	public Proprietario getCpfProp() { 
		return this.cpfProp;
	}

	public int getQtdeQuartos() {
		return qtdeQuartos;
	}
}
