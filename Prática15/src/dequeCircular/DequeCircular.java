package dequeCircular;

public class DequeCircular {

	private No prim;
	private No ult;

	
	
	//----------------------------------------------------------------Métodos
	
	public void  inserirPrimeiro(int chave) {
		No novo = new No(chave);
		if(listaVazia()) {
			setPrim(novo);
			setUlt(novo);
		}else {
			novo.setProx(prim);
			setPrim(novo);
		}
	}
	
	public void  inserirUltimo(int chave) {
		No novo = new No(chave);
		if(listaVazia()) {
			setPrim(novo);
			setUlt(novo);
		}else {
			this.ult.setProx(novo);
			setUlt(novo);
			ult.setProx(this.prim);
		}
	}
	
	public void removerPrimeiro(){
		this.ult.setProx(this.prim.getProx());
		setPrim(this.prim.getProx());
		
	}
	
	public void removerUltimo(){
		No atual = this.prim;
		while(atual.getProx() != this.ult) {
			atual = atual.getProx();
		}
		atual.setProx(this.prim);
		setUlt(atual);
	}
	
	public String imprimir(){
		String result = this.prim.getChave()+",";
		if(listaVazia())result = "Deque vazio.";
		else {
		No aux = this.prim.getProx();
		while(aux != null && aux != this.prim) {
			result += aux.getChave()+",";
			aux = aux.getProx();
		}
		}
		return result;
	}

	public boolean listaVazia() {
		boolean result = false;
		if(this.prim == null && this.ult == null) result = true;
		return result;
	}

	//----------------------------------------------------------------Getters and Setters
	public No getPrim() {
		return prim;
	}
	public void setPrim(No prim) {
		this.prim = prim;
	}
	public No getUlt() {
		return ult;
	}
	public void setUlt(No ult) {
		this.ult = ult;
	}
	
	
	
	
	
	
}
