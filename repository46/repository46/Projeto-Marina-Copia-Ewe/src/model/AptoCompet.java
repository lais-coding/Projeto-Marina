package model;

public class AptoCompet {
	
	private static int conjAptosCompetencia;
	public SetApComp setApCp;
	
	public int getNumeroApartamentos() throws Exception {
		int tamVetorAptos = setApCp.setApartamento.size();
		
		for (int i = 0; i < tamVetorAptos; i ++) {
			Apartamento ap = (Apartamento) setApCp.setApartamento.get(i);
			conjAptosCompetencia ++;
		}
		return conjAptosCompetencia;
	}
	
}
