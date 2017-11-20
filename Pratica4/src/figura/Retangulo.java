package figura;

public class Retangulo extends Figura{

	private double base;
	private double altura;
	
	Retangulo(){};
	Retangulo(double base, double altura){
		setAltura(altura);
		setBase(base);
	}
	
	@Override
	public double getArea(){
		return base*altura;
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
