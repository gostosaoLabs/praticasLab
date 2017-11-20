package listaDuplamenteEncadeada;

public class Aplicacao {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		lista.inserirPrimeiro(1);
		lista.inserirPrimeiro(2);
		lista.inserirPrimeiro(3);
		lista.removerFinal();
		System.out.println(lista.getUlt().getId());
	}

}
