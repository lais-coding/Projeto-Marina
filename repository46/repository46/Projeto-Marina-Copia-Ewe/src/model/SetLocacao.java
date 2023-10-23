package model;

import setobj.SetObject;

public class SetLocacao {

	public SetObject apartamentos;
	public SetObject moradores;
	
	public void adicionaMorador(Morador mora) throws Exception {
		moradores.addLast(mora);
	}
	
	public void adicionaApartamento(Apartamento ap) throws Exception {
		apartamentos.addLast(ap);
	}
}
