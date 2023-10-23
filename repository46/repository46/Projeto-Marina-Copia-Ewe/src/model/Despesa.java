package model;

public class Despesa {

	private String anoDespesa;
	private String mesDespesa;
	private float valorDespesa;
	private String dtEmissao;
	private String dtVencimentoDespesa;
	private String dtPagamentoDespesa;
	private Competencia compDespesa;
	public SetDespApto set;
	
	public Despesa(String ano, String mes, float valor, String emissao, String venc, String pgto) {
		this.anoDespesa = ano;
		this.mesDespesa = mes;
		this.valorDespesa = valor;
		this.dtEmissao = emissao;
		this.dtVencimentoDespesa = venc;
		this.dtPagamentoDespesa = pgto;
		
	}
	
	
	public float getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(float valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public String getAnoDespesa() {
		return anoDespesa;
	}
	public void setAnoDespesa(String anoDespesa) {
		this.anoDespesa = anoDespesa;
	}
	public String getMesDespesa() {
		return mesDespesa;
	}
	public void setMesDespesa(String mesDespesa) {
		this.mesDespesa = mesDespesa;
	}
	public String getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(String dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public String getDtVencimentoDespesa() {
		return dtVencimentoDespesa;
	}
	public void setDtVencimentoDespesa(String dtVencimentoDespesa) {
		this.dtVencimentoDespesa = dtVencimentoDespesa;
	}
	public String getDtPagamentoDespesa() {
		return dtPagamentoDespesa;
	}
	public void setDtPagamentoDespesa(String dtPagamentoDespesa) {
		this.dtPagamentoDespesa = dtPagamentoDespesa;
	}


	public Competencia getCompDespesa() {
		return compDespesa;
	}


	public void setCompDespesa(Competencia compDespesa) {
		this.compDespesa = compDespesa;
	}
	
}
