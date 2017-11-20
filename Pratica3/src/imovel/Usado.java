package imovel;

public class Usado extends Imovel{

	private double desconto;
	
	public Usado(String endereco, double preco, double desconto) {
		super(endereco, preco-desconto);
		setDesconto(desconto);
	}

	public double getDesconto() {
		return desconto;
	}

	private void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
