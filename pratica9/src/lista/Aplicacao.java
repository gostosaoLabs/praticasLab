package lista;

public class Aplicacao {

	public static void main(String[] args) {
		ListaLinear lista = new ListaLinear();
		lista.inserirInicio("eu");
		lista.inserirInicio("Oi");

		lista.inserirFinal("Goku");

		lista.inserirMeio("sou",2);
		lista.escreveLista();
		

	}

}
