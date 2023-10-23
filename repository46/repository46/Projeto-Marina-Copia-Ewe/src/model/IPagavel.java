package model;

import java.time.LocalDate;

public interface IPagavel {
	public boolean pagar(LocalDate dtPagamentoCobranca);
}
