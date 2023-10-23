package model;

public class DespesaApto {

	private static float totalDespesas;
	public SetDespApto setDpAp;
	
	public float getTotalDespesas() throws Exception {
		int tamVtDespesas = setDpAp.despesas.size();
		
		for (int i = 0; i < tamVtDespesas; i ++) {
			Despesa dp = (Despesa) setDpAp.despesas.get(i);
			totalDespesas = totalDespesas + dp.getValorDespesa();
		}
		return totalDespesas;
	}
}
