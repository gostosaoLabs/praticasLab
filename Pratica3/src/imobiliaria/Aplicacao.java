package imobiliaria;
import imovel.*;

public class Aplicacao {

	public static void main(String[] args) {

		Imovel imovelAluguel[] = new Imovel[5];
		imovelAluguel[0] = new Novo("Rua Sei lá, Bairro Fim de mundo, Venda Nova", 1500,300);
		imovelAluguel[1] = new Novo("Rua Também não sei, Bairro Casa do chapéu, Venda Nova", 1250, 150);
		imovelAluguel[2] = new Usado("Rua Y, Bairro H, BH", 500, 100);
		imovelAluguel[3] = new Usado("Rua Z, Bairro J, BH", 460, 60);
		imovelAluguel[4] = new Usado("Rua X, Bairro K, BH", 890, 30); 
		
		Imovel menorAluguel = imovelAluguel[0];
		
		for(int i=1;i<imovelAluguel.length;i++) {
			if(imovelAluguel[i].getPreco() < menorAluguel.getPreco()) {
				menorAluguel = imovelAluguel[i];
			}
		}
		System.out.println(menorAluguel.imovel());
		
		
		Imovel imovelVenda[] = new Imovel[5];
		
		imovelVenda[0] = new Novo("Rua Sei lá, Bairro Fim de mundo, Venda Nova", 150000,3000);
		imovelVenda[1] = new Novo("Rua Também não sei, Bairro Casa do chapéu, Venda Nova", 125000, 15000);
		imovelVenda[2] = new Novo("Rua Ja falei, Bairro Lugar nenhum,Venda Nova", 500000, 10000);
		imovelVenda[3] = new Usado("Rua Z, Bairro J, BH", 70000, 6000);
		
		
		Imovel maiorVenda = imovelVenda[0];
		
		for(int i=1;i<4;i++) {
				if(imovelVenda[i].getPreco() > maiorVenda.getPreco()) {
						maiorVenda = imovelVenda[i];
				}
		}	
		
		System.out.println(maiorVenda.imovel());
		
	}

}
