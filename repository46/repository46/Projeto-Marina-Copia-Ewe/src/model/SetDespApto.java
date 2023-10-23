package model;
import setobj.SetObject;

public class SetDespApto {
	public SetObject aptos;
	public SetObject despesas;
	
	public void adicionaApto(Apartamento ap) throws Exception {
		aptos.addLast(ap);
	}
	
	public void adicionaDespesa(Despesa dp) throws Exception {
		despesas.addLast(dp);
	}
	
}
