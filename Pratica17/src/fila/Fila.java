package fila;
import arvoreBinaria.*;

public class Fila {

	public Item cabeca;
	public Item cauda;
	
	
//------------------------------------------------------------------------------------------------Métodos
	 public boolean filaVazia(){
			boolean vazia= false;
		if(this.cabeca == null) vazia= true; 
			return vazia;
		}

	 
	 public Item desenfileira(){
		Item retirado;
		 if(this.filaVazia())retirado = null;
		 else {
			 retirado = this.cabeca;
			this.cabeca = this.cabeca.getProx(); 
		 } 
		 return retirado;
	 }

	 public boolean enfileira(No item){
		 boolean inserido =  false;
		  if(filaVazia()) {
			 Item novo = new Item();
			 novo.setChave(item);
			 this.cabeca = novo;
			 this.cauda = novo;
			 inserido = true;
		 }else {
			 Item novo = new Item();
			 novo.setChave(item);
			 this.cauda.setProx(novo);
			 this.cauda = novo;
			 inserido = true;
		   }
		 return inserido;
	}
	
	 public Item primeiro() {
		 return cabeca;
	 }
	 public Item ultimo() {
		 return cauda;
	 }
	 
	 public void fazListaVazia(){
		 cabeca.setProx(null);
		 cabeca = null;
		 cauda = null;
	 }
	 public String escrever() {
			String result = "";
			if(filaVazia()){
				result = "Lista Vazia!";
			}else {
				Item atual = this.cabeca;
				while(atual != null) {
					result += atual.getChave().getItem() + " -> ";
					atual = atual.getProx();
				}
			}
			return result;
		}
}
