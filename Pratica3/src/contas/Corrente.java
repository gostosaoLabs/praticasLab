package contas;

public class Corrente extends Conta{
	
	public void cobrancaTaxa() {
		double saldo = getSaldo()*0.95;
		setSaldo(saldo);
	}
}
