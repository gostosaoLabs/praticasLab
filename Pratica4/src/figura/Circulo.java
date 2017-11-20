package figura;

public class Circulo extends Figura {

	private double raio;
	
	Circulo(){};
	Circulo(double raio){
		setRaio(raio);
	}

	
	@Override
	public double getArea(){
		return 3.14*Math.pow(raio,2);
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
