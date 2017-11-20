package estoque;

public class Aplicacao {

	public static void main(String[] args) {
		
		Estoque[] estoque = new Estoque[10]; 
		
		estoque[0] = new Armario(200,10);
		estoque[1]= new Mesa(100,20);
		estoque[2] = new Cadeira(50,20);
		estoque[3] = new Fogao(350,10);
		estoque[4] = new Refrigerador(150,10);
		System.out.println(estoque[1].getQuantTotalEstoque());
		System.out.println(estoque[2].getValorTotal());
	}

}
