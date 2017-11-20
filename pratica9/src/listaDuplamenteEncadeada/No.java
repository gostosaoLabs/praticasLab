package listaDuplamenteEncadeada;

public class No {
	
	private int id;
	private No prox;
	private No ant;
	public No(int id) {
		this.id = id;
		this.prox=null;
		this.ant=null;
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

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}
}
