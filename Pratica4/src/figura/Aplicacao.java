package figura;

public class Aplicacao {

	public static void main(String[] args) {
		
		Figura[][] fig = new Figura[3][3];
		fig[0][0]= new Circulo(5);
		fig[0][1]= new Triangulo(12, 20);
		fig[0][2]= new Retangulo(10, 30);
		fig[1][0]= new Trapezio(10,5,12);

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(fig[i][j]!=null) {
					System.out.println("Area:"+fig[i][j].getArea());
				}
			}
		}
	}

}
