package voos;

public class VoosInternacionais extends Voos {

	private double taxa;
	private double seguro;
	
	public VoosInternacionais(int id, double preco,int taxa,double seguro, String origem, String destino, Data data) {
		super(id, (preco+taxa+seguro), origem, destino, data);
		setSeguro(seguro);
		setTaxa(taxa);
		
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	
	
}
