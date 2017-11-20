package deque;

public class Aplicação {

	public static void main(String[] args) {
		
		Deque deq = new Deque();
		deq.inserirPrimeiro(2);
		deq.inserirPrimeiro(4);
		deq.inserirPrimeiro(6);
		deq.inserirUltimo(8);
		
		
		System.out.println(deq.getUlt().getChave());
		System.out.println(deq.imprimir());
		
	}

}
