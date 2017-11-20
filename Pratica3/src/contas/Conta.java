package contas;

public  class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double saque(){
		return getSaldo();
	}
	public void deposito(double valor) {
		setSaldo(valor);
	}
	
	public String saldo() {
		return "Saldo: " + getSaldo();
	}
}
