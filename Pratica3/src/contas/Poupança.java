package contas;

public class Poupan�a extends Conta{

	public void rendimento() {
		double saldo = getSaldo()*1.03;
		setSaldo(saldo);
	}
	
}
