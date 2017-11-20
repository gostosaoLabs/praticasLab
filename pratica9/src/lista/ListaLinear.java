package lista;
public class ListaLinear {

	public final static int MAXTAM=100;
	public static int ultimo=-1;
	private String[] item = new String[MAXTAM];


	public boolean listaVazia() {
		boolean vazia = false;
		if(ultimo==-1)
			 vazia=true;
		return vazia;
	}
	public boolean listaCheia() {
		boolean cheia = false;
		if(ultimo==(MAXTAM-1))
			cheia=true;
		return cheia;
	}
	
	public void esvaziarLista() {
		for(int i=0;i<=ultimo;i++) {
			item[i]=null;
		}
		ultimo=-1;
}
	public void inserirFinal(String item) {
			if(listaCheia()==false){
			ultimo++;
			this.item[ultimo]=item;
			}
		}
	
	public void inserirInicio(String item) {
		if(listaVazia())this.item[0] = item;
		else if(listaCheia()==false){
			for(int i=ultimo;i>=0;i--){
				this.item[i+1] = this.item[i];
				}
			this.item[0] = item;
		}
		ultimo++;
	}
	public void inserirMeio(String item, int index){
		if(listaCheia()==false){
			if(ultimo>=index) {
			for(int i=ultimo;i>=index;i--){
				this.item[i+1] = this.item[i];
				}
			this.item[index] = item;
		ultimo++;
			}else{
				this.item[ultimo+1] = item;
				ultimo++;
			}
		}
		
	}
	
public boolean removerFinal() {
	boolean sucesso = false;
	if(listaVazia()==false){
	this.item[ultimo]=null;
		ultimo=ultimo-1;
		sucesso=true;
	}
	return sucesso;	
}

public boolean removerInicio() {
	boolean sucesso = false;
	if(listaVazia()==false){
		for(int i=1;i<=ultimo;i++){
			this.item[i-1]=this.item[i];
			}
		ultimo=ultimo-1;
		sucesso=true;
	}
	return sucesso;	
}

public boolean removerMeio(int pos) {
	boolean sucesso = false;
	if(listaVazia()==false){
		for(int i=pos;i<ultimo;i++){
			this.item[i]=this.item[i+1];
		}
		ultimo=ultimo-1;
		sucesso=true;
	}
	return sucesso;	
}
 public void escreveLista(){
	 for(int i=0;i<=ultimo;i++){
		 System.out.println(this.item[i]);
	 }
 }
}