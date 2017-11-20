package listaCircular;

public class No {
	
	private int id;
	private No prox;

	public No(int id) {
		this.id = id;
		this.prox=null;
	}
	
//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
}
