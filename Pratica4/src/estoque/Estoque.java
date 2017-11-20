package estoque;

public abstract class Estoque {
	
	private int quant;
	private double valor;
	private static double valorTotal;
	private static double quantTotalEstoque;
	
	Estoque(double valor, int quant){
		setValor(valor);
		setQuant(quant);
		quantTotalEstoque += quant;
		valorTotal +=(valor*quant);
	}
	
	
	public void quantTotalEstoque(){
		quantTotalEstoque = 0;
	}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public static double getValorTotal() {
		return valorTotal;
	}


	public static double getQuantTotalEstoque() {
		return quantTotalEstoque;
	}

	
	
}
