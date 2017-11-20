package noListaEncadeada;

import listaDuplamenteEncadeada.No;

public final class Lista {

	private No prim;
	private No ult;
	private int quantNo;
	
	public Lista() {
		this.prim=null;
		this.ult=null;
		this.quantNo=0;
	}

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

	public int getQuantNo() {
		return quantNo;
	}

	public void setQuantNo(int quantNo) {
		this.quantNo = quantNo;
	}
	
	//----------------------------------------------------------Inserção
	
	public void inserirPrimeiro(int id){
		No novo = new No(id);
		if(this.listaVazia()) {
			this.ult = novo;
		}
		novo.setProx(this.prim);
		this.prim=novo;
		this.quantNo++;		
	}
	
	public void inserirUltimo(int id) {
		No novo = new No(id);
		if(listaVazia()){
			this.prim = novo;
		}else {
			this.ult.setProx(novo);
		}
		this.ult = novo;
		this.quantNo++;

		
	}
	
	//-----------------------------------------------------Remoção
	
	public boolean removerInicio() {
		
		if(listaVazia()){
			return false;
		}else {
			No aux = this.prim;
			this.prim = prim.getProx();
			aux.setProx(null);
				this.quantNo--;
			return true;
		}
	}
	
	public boolean removerFinal(){
		No atual = this.prim;
		No ant = null;

		if(listaVazia()){
			return false;
			}else {
				while(atual.getProx() != null){
					ant = atual;
					atual = atual.getProx();
				}
				if(atual == this.prim) {
					if(this.prim == this.ult) {
						this.ult = null;
					}
					this.prim = this.prim.getProx();
				}else {
					if(atual == this.ult) {
						this.ult = ant;
					}
					ant.setProx(null);
				}
				this.quantNo--;
				return true;
				}
		}
	
	public boolean removerPos(int pos) {
		No atual = this.prim;
		No ant = null;
		if(listaVazia()){
			return false;
		}else {
			for(int i=0;i<pos;i++){
				ant = atual;
				atual = atual.getProx();
			}
			if(atual == this.prim) {
				if(this.prim == this.ult) {
					this.ult = null;
				}
				this.prim = this.prim.getProx();
			}else {
				if(atual == this.ult) {
					this.ult = ant;
				}
				ant.setProx(atual.getProx());
			}
			this.quantNo--;
			return true;
		}
	}
	
	
	//----------------------------------------------------Métodos sobre lista
	
	public void concatenar(Lista lista) {
		No atual = lista.getPrim();
		while(atual != null) {
			inserirUltimo(atual.getId());
			atual = atual.getProx();
		}
	}
	
	public Lista particionar() {
		
		int aux = getQuantNo();
		No lista = this.getPrim();
		Lista lista2 = new Lista();
		for(int i = 0; i<(aux/2);i++) {
			lista2.inserirPrimeiro(lista.getId());
			lista = lista.getProx();
			this.removerInicio();
	}
		return lista2;
	}
	
	public Lista clonar(){
		Lista novo = new Lista();
		No aux = getPrim();
		while(aux != null) {
			novo.inserirUltimo(aux.getId());
			aux = aux.getProx();
		}
		return novo;
	}
	
	public Lista interseccao(Lista lista) {
		Lista novo = new Lista();
		No aux = lista.getPrim();
		No aux2 = getPrim();
		while(aux2 != null) {
			while(aux != null) {
				if(aux.getId() == aux2.getId())novo.inserirUltimo(aux.getId());
				aux = aux.getProx();
			}
			aux2 = aux2.getProx();
			aux = lista.getPrim();
		}
		return novo;
	}

	
	public Lista diferenca(Lista lista) {
		
		No aux;
		No aux2;
		if(this.getQuantNo()< lista.getQuantNo()) {
			aux = getPrim();
			aux2 = lista.getPrim();
		}else{
			aux = lista.getPrim();
			aux2 = getPrim();
		}
		
		Lista novo = new Lista();
	
		boolean diferente = true;
		while(aux2 != null) {
			while(aux != null && diferente==true) {
				if(aux.getId() == aux2.getId())diferente=false;
				aux = aux.getProx();
			}
			if(diferente == true)novo.inserirUltimo(aux2.getId());
			aux2 = aux2.getProx();
			aux = lista.getPrim();
			diferente = true;
		}
		return novo;
	}
	
	public Lista intercalar(Lista lista) {
		
		Lista novo = new Lista();
		No aux = this.prim;
		No aux2 = lista.getPrim();
		
		boolean continua = true;
		
		while(continua == true){
			
			if(aux !=null) {
					novo.inserirUltimo(aux.getId());
					aux = aux.getProx();
			}
			if(aux2 !=null ) {
					novo.inserirUltimo(aux2.getId());
					aux2 = aux2.getProx();		
			}
			if(aux == null && aux2 == null )continua = false;
		
		}
		return novo;
	}
	
	
	
	public int pesquisar(int id){
		int pos=0;
		No atual = this.prim;
		while((atual != null) && (atual.getId() != id)){
			atual = atual.getProx();
			pos++;
		}
		return pos;
	}
	
	
	
	
	public String imprimirLista() {
		String result = "";
		if(listaVazia()){
			result = "Lista Vazia!";
		}else {
			No atual = this.prim;
			while(atual != null) {
				result += atual.getId() + " -> ";
				atual = atual.getProx();
			}
		}
		return result;
	}
	
	
	//-----------------------------------------------------Lista vazia
	
	
	public void tornarListaVazia(){
		this.prim.setProx(null);
		this.prim.setId(0);	
		}
	public boolean listaVazia() {
		return (this.prim == null);
	}
}
