package imovel;

public class Novo extends Imovel{

	private double adicional;
	
	public Novo(String endereco, double preco, double adicional) {
		super(endereco, preco+adicional);
		setAdicional(adicional);
	}

	
	public double getAdicional() {
		return adicional;
	}
	private void setAdicional(double adicional) {
		this.adicional = adicional;
	}

}
