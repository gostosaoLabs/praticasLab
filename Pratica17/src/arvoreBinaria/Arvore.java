package arvoreBinaria;


import arquivo.GravarArq;
import fila.*;

/**
*
* @author willer hiago
*/
public class Arvore implements ArvoreBinaria {
	
	private No raiz;
	private int altura;
	private int profundidade;

	public Arvore(int item) {
		raiz = new No(item,0);
	}
	
	public Arvore() {
		this.raiz = null;
	}
	
	//---------------------------------------------------------------Insere
	public void insere(int chave) {
	insere(chave,raiz,0);
	}	
	
	private No insere(int chave, No raiz,int altura){
		
		if(raiz == null) {
			 raiz = new No(chave,altura);
			 if(altura> this.altura)this.altura = altura;
			 setProfundidade(raiz);
		}
		else{
			if(chave<raiz.getItem()) {
				raiz.setEsq(insere(chave,raiz.getEsq(),altura+1));
				setProfundidade(raiz);
			}
			else if(chave>raiz.getItem()) {
				raiz.setDir(insere(chave,raiz.getDir(),altura+1));
				setProfundidade(raiz);
			}
			}
		return raiz;	
	}
	
	//----------------------------------------------------------------Remove
	public void remove(int chave){
	 remove(chave,raiz);
	 int result = atualizaProf(this.raiz);
	if(result < this.getAltura() || result < this.getProfundidade()) {
		setProfundidade(result);
		setAltura(result);
	}
	profundidadeNodos(this.raiz,this.profundidade);
	}
	
	private No remove(int chave, No raiz){
		if (raiz == null) 
		      System.out.println ("Valor inexistente!!!");
		else if(chave < raiz.getItem()) {
			raiz.setEsq(remove(chave,raiz.getEsq()));
			setProfundidade(raiz);
			}else if(chave > raiz.getItem()) {
			raiz.setDir(remove(chave, raiz.getDir()));
			setProfundidade(raiz);
					}else { 
					if(noVazio(raiz)) {
						raiz = null;	
					}
					else {
					if(raiz.getDir() == null) {
					decrementaAltura(raiz.getEsq());
					
					raiz = raiz.getEsq();
					}else if (raiz.getEsq()== null) {
					decrementaAltura(raiz.getDir());
					raiz = raiz.getDir();
					}else{
							raiz = encontraNo(raiz);
							if(raiz.getEsq()!=null)decrementaAltura(raiz.getEsq());
					}
						} 	//raiz com duas subárvores procura 
				}			//a maior subárvore da esquerda
		if(this.altura > this.profundidade)profundidade = altura;
		return raiz;								  
	}
	
	private No encontraNo(No raiz) {
		No novo = raiz.getEsq();
		while(novo.getDir() != null) {
			novo = novo.getDir();
		}
	
		novo.setDir(raiz.getDir());
		novo.setAlturaNo(raiz.getAlturaNo());
		raiz = novo;
		return raiz;
	}


	private void decrementaAltura (No raiz){
		raiz.setAlturaNo(raiz.getAlturaNo() - 1);
		if(estahVazia())return;
		if(raiz.getEsq()!=null)decrementaAltura(raiz.getEsq());
		if(raiz.getDir()!=null)decrementaAltura(raiz.getDir());
	}
	
	private void setProfundidade(No raiz) {
		int profundidade = Math.abs(raiz.getAlturaNo()-this.altura);
		if(profundidade > this.profundidade)this.profundidade = profundidade;
		raiz.setProfundidadeNo(profundidade);
	}
	
	private int atualizaProf(No raiz) {
		int altura = raiz.getAlturaNo();
		if(estahVazia())return profundidade;
		
		if(raiz.getEsq()!=null) {
			int aux = atualizaProf(raiz.getEsq());
			if(aux > altura)altura = aux;
		}
		if(raiz.getDir()!=null) {
			int aux = atualizaProf(raiz.getDir());
			if(aux > altura)altura = aux;
		}
		
		return altura;
		
	}
	
	private void profundidadeNodos(No raiz, int profundidade) {
		raiz.setProfundidadeNo(profundidade);
		if(estahVazia())return;
		if(raiz.getEsq()!=null)profundidadeNodos(raiz.getEsq(),profundidade-1);
		if(raiz.getDir()!=null)profundidadeNodos(raiz.getDir(),profundidade-1);
		
	}
	

	//-----------------------------------------------------------------Raiz sem filhos
	public boolean estahVazia(){
	     boolean vazia=false;
	     if( raiz.getEsq()== null && raiz.getDir()== null){
	         vazia= true;
	     }
	     return vazia;
	     }

	private boolean noVazio(No raiz){
		 boolean vazia=false;
	     if( raiz.getEsq()== null && raiz.getDir()== null){
	         vazia= true;
	     }
	     return vazia;
	}
	
	
	
	//----------------------------------------------------------------Pesquisa Nos
	
	public boolean existeNaArvore(int chave) {
		boolean result = false;
		int valor;
		valor = existeNaArvore(chave, this.raiz);
		if(valor == chave)result = true;	
		return result;
	}	
	
	private int existeNaArvore(int chave, No raiz) {
		int result = 0;
		if(!estahVazia()) {
			if(chave == raiz.getItem()) result = chave;
			else {
					if(raiz.getEsq()!=null)result = existeNaArvore(chave,raiz.getEsq());
					if(result != chave) {
						if(raiz.getDir()!=null)result = existeNaArvore(chave,raiz.getDir());
					}
				}
		}
		return result;
		}	

	
	public void preOrdem(){
		preOrdem(raiz);
	}
	private void preOrdem(No raiz){
		if(estahVazia())return;
		System.out.print(raiz.getItem()+", ");
		if(raiz.getEsq()!=null)preOrdem(raiz.getEsq());
		if(raiz.getDir()!=null)preOrdem(raiz.getDir());
		}
	
	public void posOrdem(){
		posOrdem(this.raiz);
	}
	private void posOrdem(No raiz){
		if(estahVazia())return;
		if(raiz.getEsq()!=null)posOrdem(raiz.getEsq());
		if(raiz.getDir()!=null)posOrdem(raiz.getDir());
		System.out.print(raiz.getItem()+", ");
		}
	
	public void emOrdem(){
		emOrdem(this.raiz);
	}
	private void emOrdem(No raiz){
		if(estahVazia())return;
		if(raiz.getEsq()!=null)emOrdem(raiz.getEsq());
		System.out.print(raiz.getItem()+", ");
		if(raiz.getDir()!=null)emOrdem(raiz.getDir());
		}
	
	public void largura(){
		Fila fila = new Fila();
		fila.enfileira(this.raiz);
		String result = "";
		while(!fila.filaVazia()){
			result += fila.cabeca.getChave().getItem()+", ";
			if(fila.cabeca.getChave().getEsq() != null)fila.enfileira(fila.cabeca.getChave().getEsq());
			if(fila.cabeca.getChave().getDir() != null)fila.enfileira(fila.cabeca.getChave().getDir());
			fila.desenfileira();
		}
		System.out.println(result);
	}
	
	public void salvarArquivo() {
		
		Fila fila = new Fila();
		fila.enfileira(this.raiz);
		String result = "";
		while(!fila.filaVazia()){
			result += fila.cabeca.getChave().getItem()+", ";
			if(fila.cabeca.getChave().getEsq() != null)fila.enfileira(fila.cabeca.getChave().getEsq());
			if(fila.cabeca.getChave().getDir() != null)fila.enfileira(fila.cabeca.getChave().getDir());
			fila.desenfileira();
		}
		GravarArq gravar = new GravarArq();
		gravar.gravar("==========Arvore========== ");
		gravar.gravar("Nodos: "+result);
		gravar.gravar("Altura da árvore: "+this.getAltura());
		gravar.gravar("Profundidade da árvore: "+this.getProfundidade());
	}
	//----------------------------------------------------------------Pesquisa Chave
	
	public No pesquisaNo(int item){
		No result = pesquisaNo(item,raiz);
		return result; 
	}
	
	private No pesquisaNo(int item,No raiz){
		No novo = null;
		if(raiz.getItem() == item)novo = raiz;
		else if(item < raiz.getItem()) {
			if(raiz.getEsq() != null) novo = pesquisaNo(item, raiz.getEsq());
		}
			else if(raiz.getDir() != null)novo = pesquisaNo(item, raiz.getDir());
		
		return novo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
}



	

	

	
	
