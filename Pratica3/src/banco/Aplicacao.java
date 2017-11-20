package banco;

import contas.Corrente;
import contas.Poupan�a;

public class Aplicacao {

	public static void main(String[] args) {

		Poupan�a poup = new Poupan�a();
		Poupan�a poup2 = new Poupan�a();
		Corrente corren = new Corrente();
		
		poup.deposito(300);
		System.out.println("Poupan�a 1 - Saldo:" + poup.saldo());
		poup2.deposito(1000);
		System.out.println("Poupan�a 2 - Saldo:" + poup2.saldo());
		corren.deposito(2000);
		System.out.println("Corrente 1 - Saldo:" + corren.saldo());
		
		System.out.println("------------------------Rendimento----------------------");
		poup.rendimento();;
		poup2.rendimento();
		System.out.println("Poupan�a 1 - Saldo:" + poup.saldo());
		System.out.println("Poupan�a 2 - Saldo:" + poup2.saldo());
		
		System.out.println("------------------------Cobran�a taxas----------------------");
		corren.cobrancaTaxa();
		System.out.println("Corrente 1 - Saldo:" + corren.saldo());
		
		
		
		
	}

}
