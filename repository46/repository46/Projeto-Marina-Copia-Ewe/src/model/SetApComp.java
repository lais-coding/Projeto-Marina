package model;

import setobj.SetObject;

public class SetApComp {

	public SetObject setApartamento;
	public SetObject setCompetencia;
	
	public void adicionaApartamento(Apartamento ap) throws Exception {
		setApartamento.addLast(ap);
	}
	
	public void adicionaCompetencia(Competencia cp) throws Exception {
		setCompetencia.addLast(cp);
	}
}
