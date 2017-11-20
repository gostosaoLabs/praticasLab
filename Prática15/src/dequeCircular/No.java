package dequeCircular;

public class No {

	private int chave;
	private No prox;
	
	public No(int chave) {
		this.chave = chave;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
}
