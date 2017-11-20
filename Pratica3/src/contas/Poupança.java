package contas;

public class Poupança extends Conta{

	public void rendimento() {
		double saldo = getSaldo()*1.03;
		setSaldo(saldo);
	}
	
}
