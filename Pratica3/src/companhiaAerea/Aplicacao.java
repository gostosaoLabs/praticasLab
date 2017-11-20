package companhiaAerea;
import voos.*;

public class Aplicacao {

	public static void main(String[] args) {
	
		Data data = new Data(26, 10, 2017, 18, 21);
		
		Voos voo[] = new Voos[5]; 
		voo [0] = new VoosInternacionais(1, 2500,50 ,100 ,"Belo Horizonte", "New York", data);
		voo [1] = new VoosInternacionais(2, 1500,75 ,100 ,"Belo Horizonte", "Bariloche", data);
		voo [2] = new VoosInternacionais(3, 5000,200 ,300 ,"Belo Horizonte", "Tokyo", data);
		voo [3] = new VoosNacionais(4, 750,"Belo Horizonte", "São Paulo", data);
		voo [4] = new VoosNacionais(5,1500 ,"Belo Horizonte", "Porto Seguro", data);
		
	for(int i=0;i<voo.length;i++) {
		System.out.println("==========================================");
		System.out.println(voo[i].dadosVoo());
	}
	
	}

}
