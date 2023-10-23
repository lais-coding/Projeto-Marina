package controller;

import java.util.List;

import model.Apartamento;
import model.Despesa;

public class ControleLancarDespesas {
	
	public static List<Apartamento> listaApartamentos;

	public void criarDespesa(String ano, String mes, float valor, String emissao, String venc, String pgto) {
		Despesa desp = new Despesa(ano, mes, valor, emissao, venc, pgto);
	}
	
	public void criarApartamento(int qtdQuartos, String numeroAp, String tpOcup) {
		Apartamento ap = new Apartamento(qtdQuartos, tpOcup, tpOcup);
		addListaApto(ap);
	}
	
	public void addListaApto(Apartamento ap) {
	
		listaApartamentos.add(ap);
		
	}
	
	public void consultarApartamento(Apartamento ap) {
		
		if (listaApartamentos.contains(ap)) {
			System.out.println("Apartamento existe na lista");
		}
		
	}
	
}
