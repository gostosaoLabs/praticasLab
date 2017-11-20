package banco;

import contas.Corrente;
import contas.Poupança;

public class Aplicacao {

	public static void main(String[] args) {

		Poupança poup = new Poupança();
		Poupança poup2 = new Poupança();
		Corrente corren = new Corrente();
		
		poup.deposito(300);
		System.out.println("Poupança 1 - Saldo:" + poup.saldo());
		poup2.deposito(1000);
		System.out.println("Poupança 2 - Saldo:" + poup2.saldo());
		corren.deposito(2000);
		System.out.println("Corrente 1 - Saldo:" + corren.saldo());
		
		System.out.println("------------------------Rendimento----------------------");
		poup.rendimento();;
		poup2.rendimento();
		System.out.println("Poupança 1 - Saldo:" + poup.saldo());
		System.out.println("Poupança 2 - Saldo:" + poup2.saldo());
		
		System.out.println("------------------------Cobrança taxas----------------------");
		corren.cobrancaTaxa();
		System.out.println("Corrente 1 - Saldo:" + corren.saldo());
		
		
		
		
	}

}
