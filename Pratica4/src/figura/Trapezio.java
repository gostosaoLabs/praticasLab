package figura;

public class Trapezio extends Figura {
	
	private double basemaior;
	private double basemenor;
	private double altura;
	
	Trapezio(){};
	Trapezio(double basemaior, double basemenor ,double altura){
		setAltura(altura);
		setBasemaior(basemaior);
		setBasemenor(basemenor);
	}


	@Override
	public double getArea(){
		return ((basemaior + basemenor)*altura)/2;
	}
	
	
	
	public double getBasemaior() {
		return basemaior;
	}
	public void setBasemaior(double basemaior) {
		this.basemaior = basemaior;
	}
	public double getBasemenor() {
		return basemenor;
	}
	public void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
