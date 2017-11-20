package noListaEncadeada;


public class Aplicacao {
	

	public static void main(String[] args) {
	
		
	

		
		Lista lista = new Lista();
		lista.inserirUltimo(2);
		lista.inserirUltimo(3);
		lista.inserirUltimo(4);
		
		
		Lista lista2 = new Lista();

		lista2.inserirUltimo(1);
		lista2.inserirUltimo(2);
		lista2.inserirUltimo(3);
		lista2.inserirUltimo(5);
	
		
				
		System.out.println(lista.imprimirLista());
		System.out.println();
		System.out.println(lista2.imprimirLista());
		
		Lista lista3 = lista.interseccao(lista2);
		
		System.out.println(lista3.imprimirLista());

	
	}

}
