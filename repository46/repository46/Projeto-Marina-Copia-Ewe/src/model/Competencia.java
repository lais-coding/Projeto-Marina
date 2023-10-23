package model;

public class Competencia {

	private String mesCompetencia;
	private String anoCompetencia;
	private static float totalDespesa = 0; //verificar se dá certo assim
	private Despesa[] conjuntoDespesas;
	
	public Competencia(String mes, String ano) {
		this.mesCompetencia = mes;
		this.anoCompetencia = ano;
	}
	
	public float getTotalDespesa() {
		int tamVetor = conjuntoDespesas.length;
		for (int i = 0; i < tamVetor; i ++) {
			if (conjuntoDespesas[i].getAnoDespesa() == anoCompetencia && conjuntoDespesas[i].getMesDespesa() == mesCompetencia) {
				totalDespesa = totalDespesa + conjuntoDespesas[i].getValorDespesa();
			}
		}
		return totalDespesa;
	}
	
	/*public static void setTotalDespesa(float totalDespesa) { //verificar
		Competencia.totalDespesa = totalDespesa;
	}*/

	
	public String getMesCompetencia() {
		return mesCompetencia;
	}

	public void setMesCompetencia(String mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}

	public String getAnoCompetencia() {
		return anoCompetencia;
	}

	public void setAnoCompetencia(String anoCompetencia) {
		this.anoCompetencia = anoCompetencia;
	}

	
	public Despesa[] getConjuntoDespesas() {
		return conjuntoDespesas;
	}

	public void setConjuntoDespesas(Despesa[] conjuntoDespesas) {
		this.conjuntoDespesas = conjuntoDespesas;
	}
}
