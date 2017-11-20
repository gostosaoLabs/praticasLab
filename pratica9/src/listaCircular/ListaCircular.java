package listaCircular;

public class ListaCircular {

	private No prim;
	private No ult;
	private int quantNo;
	
	public ListaCircular() {
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
	
	//-------------------------Métodos---------------------------
	
	public void inserirPrimeiro(int id){
		No novo = new No(id);
		if(this.listaVazia()) {
			this.prim = novo;
			this.ult = novo;
			novo.setProx(ult);
		}
		novo.setProx(this.prim);
		this.prim=novo;
		this.quantNo++;		
	}
	
	public void inserirUltimo(int id) {
		No novo = new No(id);
		if(listaVazia()){
			this.prim = novo;
			this.ult = novo;
			novo.setProx(ult);
		}else {
			this.ult.setProx(novo);
			this.ult = novo;
			novo.setProx(prim);
		}
		this.quantNo++;

		
	}
	
	
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
		boolean result;

		if(listaVazia()){
			 result = false;
			}else {
				while(atual.getProx() != this.ult){
					atual = atual.getProx();
				}
				if(atual == this.prim) {
					this.prim = this.prim.getProx();
					this.prim.setProx(ult);
				}else {
					atual.setProx(prim);
					this.ult = atual;
				}
				this.quantNo--;
				result =  true;
				}
		return result;
		}
	
	public void concatenar(ListaCircular lista) {
		No atual = lista.getPrim();
		while(atual != null) {
			inserirUltimo(atual.getId());
			atual = atual.getProx();
		}
	}
	
	public ListaCircular particionar() {
		
		int aux = getQuantNo();
		No lista = this.getPrim();
		ListaCircular lista2 = new ListaCircular();
		for(int i = 0; i<(aux/2);i++) {
			lista2.inserirPrimeiro(lista.getId());
			lista = lista.getProx();
			this.removerInicio();
	}
		return lista2;
	}
	
	public ListaCircular clonar(){
		ListaCircular novo = new ListaCircular();
		No aux = getPrim();
		while(aux != null) {
			novo.inserirUltimo(aux.getId());
			aux = aux.getProx();
		}
		return novo;
	}
	
	public ListaCircular interseccao(ListaCircular lista) {
		ListaCircular novo = new ListaCircular();
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

	
	public ListaCircular diferenca(ListaCircular lista) {
		
		No aux;
		No aux2;
		if(this.getQuantNo()< lista.getQuantNo()) {
			aux = getPrim();
			aux2 = lista.getPrim();
		}else{
			aux = lista.getPrim();
			aux2 = getPrim();
		}
		
		ListaCircular novo = new ListaCircular();
	
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
	public int pesquisar(int id){
		int pos=0;
		No atual = this.prim;
		while((atual.getProx() != this.prim) && (atual.getId() != id)){
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
			while(atual.getId() != this.ult.getProx().getId()) {
				result += atual.getId() + " -> ";
				atual = atual.getProx();
			}
			result += atual.getId() + " -> ";
		}
		return result;
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
	
	public void tornarListaVazia(){
		this.prim.setProx(null);
		this.prim.setId(0);	
		}
	public boolean listaVazia() {
		return (this.prim == null);
	}
}
