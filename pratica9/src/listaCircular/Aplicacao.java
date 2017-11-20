package listaCircular;

public class Aplicacao {

	public static void main(String []args) {
		ListaCircular lista = new ListaCircular();
		lista.inserirPrimeiro(1);
		System.out.println(lista.getUlt().getId());
		lista.inserirPrimeiro(2);
		System.out.println(lista.getUlt().getId());
		lista.inserirPrimeiro(3);
		System.out.println(lista.getUlt().getId());
		lista.inserirUltimo(4);
		System.out.println(lista.getUlt().getId());
		System.out.println(lista.imprimirLista());
	}
	
}
