package view;

import java.util.Scanner;
import controller.ControleGerarCobranca;
import controller.ControleLancarDespesas;
import model.Apartamento;
import model.Competencia;
import model.Despesa;

public class Principal {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("MANUTENCAO DE CONDOMINIO");
			System.out.println("Selecione um numero para gerenciar o condominio:");
			System.out.println("1 - Lancar nova despesa; \n 2 - Gerar cobranca \n 9 - Sair");
			
			int opc = scan.nextInt();
			switch(opc) {
			case 1:
				ControleLancarDespesas desp = new ControleLancarDespesas();
				infosCompetencia();
				infosApto();
				infosDespesa();
				System.out.println("DESPESA LANCADA!");
				break;
			case 2:
				ControleGerarCobranca cobra = new ControleGerarCobranca();
				consultaApto();
				consultaCompetencia();
				float valorCobrado = cobra.gerarCobranca();
				System.out.println("COBRANCA GERADA. VALOR A PAGAR: " +valorCobrado);
				break;
			case 9:
				System.out.println("Programa finalizado");
				System.exit(0);
			default:
				System.out.println("ESCOLHER ENTRE AS OPCOES CABIVEIS.");
				break;
			}
		}

	}

	private static Competencia consultaCompetencia() {
		
		//CODIGO DE CONSULTA DE COMPETENCIA. CONECTA COM O CONTROLLER.
		
		Competencia c;
		return c;
		
	}

	private static Apartamento consultaApto() {
		
		//CODIGO DE CONSULTA DE APARTAMENTOS. CONECTA COM O CONTROLLER.
		Apartamento ap = new Apartamento(0, null, null);
		return ap;
		
	}

	private static void infosCompetencia() {
		System.out.println("INFORME DADOS DA DESPESA OU DA COBRANCA:");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mes:");
		String mes = scan.nextLine();
		
		System.out.println("Ano:");
		String ano = scan.nextLine();
		
		Competencia c = new Competencia(mes, ano);
	}

	private static void infosApto() {
		System.out.println("INFORME DADOS DO APARTAMENTO:");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de quartos:");
		int qtd = scan.nextInt();
		
		System.out.println("Numero do apartamento:");
		String numero = scan.nextLine();
		
		System.out.println("Tipo de ocupacao:");
		String tp = scan.nextLine();
		
		ControleLancarDespesas desp = new ControleLancarDespesas();
		Apartamento ap = new Apartamento(qtd, numero, tp);
	}

	private static void infosDespesa() {
		System.out.println("INFORME OS DADOS DA DESPESA:");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ano da despesa:");
		String ano = scan.nextLine();
		
		System.out.println("Mes da despesa:");
		String mes = scan.nextLine();
		
		System.out.println("Valor:");
		float valor = scan.nextFloat();
		
		System.out.println("Data de emissao:");
		String emissao = scan.nextLine();
		
		System.out.println("Data de vencimento:");
		String venc = scan.nextLine();
		
		ControleLancarDespesas desp = new ControleLancarDespesas();
		Despesa despesa = new Despesa(ano, mes, valor, emissao, venc, null);

		System.out.println("STATUS: DESPESA LANCADA.");
    }
	

	
	
}