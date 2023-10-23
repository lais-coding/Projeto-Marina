package model;

import java.time.LocalDate;

public class Cobranca implements IPagavel {

	private String anoCobranca;
	private String mesCobranca;
	private float valorCobranca;
	private LocalDate dtVencimento;
	private LocalDate dtPagCobranca;
	private float jurosMulta;
	private Competencia comp;
	
	public boolean pagar(LocalDate dtPagamentoCobranca) {
		setDataPagamento(dtPagCobranca);
		return true;
	}
	
	
	private void setDataPagamento(LocalDate dtPago) { //é privado pois só o método PAGAR tem autorização p mexer.
		this.dtPagCobranca = dtPago;
	}


	public String getAnoCobranca() {
		return anoCobranca;
	}


	public void setAnoCobranca(String anoCobranca) {
		this.anoCobranca = anoCobranca;
	}


	public String getMesCobranca() {
		return mesCobranca;
	}


	public void setMesCobranca(String mesCobranca) {
		this.mesCobranca = mesCobranca;
	}


	public float getValorCobranca() {
		return valorCobranca;
	}


	public void setValorCobranca(float valorCobranca) {
		this.valorCobranca = valorCobranca;
	}


	public LocalDate getDtVencimento() {
		return dtVencimento;
	}


	public void setDtVencimento(LocalDate dtVencimento) {
		this.dtVencimento = dtVencimento;
	}


	public LocalDate getDtPagCobranca() {
		return dtPagCobranca;
	}


	public void setDtPagCobranca(LocalDate dtPagCobranca) {
		this.dtPagCobranca = dtPagCobranca;
	}


	public float getJurosMulta() {
		return jurosMulta;
	}


	public void setJurosMulta(float jurosMulta) {
		this.jurosMulta = jurosMulta;
	}


	public Competencia getComp() {
		return comp;
	}


	public void setComp(Competencia comp) {
		this.comp = comp;
	}
	
}
