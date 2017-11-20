package figura;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	
	Triangulo(){};
	Triangulo(double base,double altura){
		setBase(base);
		setAltura(altura);
	}

	@Override
	public double getArea(){
		return (altura*base)/2;
}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
