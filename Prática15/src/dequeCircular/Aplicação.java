package dequeCircular;

public class Aplicação {

	public static void main(String[] args) {
		
		DequeCircular deq = new DequeCircular();
		deq.inserirPrimeiro(2);
		deq.inserirPrimeiro(4);
		deq.inserirPrimeiro(6);
		deq.inserirUltimo(8);
		deq.removerPrimeiro();
		deq.removerUltimo();
		
		
		System.out.println("Deque: "+deq.imprimir());
		System.out.println("Proximo do ultimo nodo: "+deq.getUlt().getProx().getChave());
	}

}
