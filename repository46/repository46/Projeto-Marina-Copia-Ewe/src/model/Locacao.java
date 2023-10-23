package model;
import java.time.LocalDate;

public class Locacao {
	private LocalDate inicioLocacao;
	public SetLocacao locacoes;
	
	public Locacao() {
		inicioLocacao = LocalDate.now();
	}
	
	public LocalDate getInicioLocacao() {
		return this.inicioLocacao;
	}

}
