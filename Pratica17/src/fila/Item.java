package fila;
import arvoreBinaria.*;
public class Item {
	
	private No chave;
	Item prox;
	
	public Item getProx() {
		return prox;
	}

	public void setProx(Item prox) {
		this.prox = prox;
	}

	Item(){
	}
	
	Item(No chave){
	 this.setChave(chave);
	 
	}
	 public No getChave(){
	 return this.chave;
	}
	
	void setChave(No chave){
	 this.chave=chave;
	}


}
