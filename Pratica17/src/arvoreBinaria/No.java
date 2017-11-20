package arvoreBinaria;

public class No {

	private int item;
	private No esq;
	private No dir;
	private int alturaNo;
	private int profundidadeNo;
	

		
	public No(){}
	
	public No(int item){
			setItem(item);
		}
	
		No(int item,int alt){
			setItem(item);
			setAlturaNo(alt);
		}
	
		
		public int balanceado(){
			int result = 0;
			if(getDir() == null && getEsq() == null)result = 0; // quando ambos lados forem nulos
			else if(getDir()==null)result = 0 - qntNos(getEsq());
				else if(getEsq() == null) result = qntNos(getDir()) - 0;
					else result = qntNos(getDir()) - qntNos(getEsq());
			return result;
		}
		
		private int qntNos(No raiz){
			int result = 0;
			if(raiz.getEsq()!=null) {
				result = qntNos(raiz.getEsq());
			}
			if(raiz.getDir()!=null) {
				result = qntNos(raiz.getDir());
			}
			result++;
			return result;
			}
		
		
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public No getEsq() {
		return esq;
	}
	public void setEsq(No esq) {
		this.esq = esq;
	}
	public No getDir() {
		return dir;
	}
	public void setDir(No dir) {
		this.dir = dir;
	}

	public int getAlturaNo() {
		return alturaNo;
	}

	public void setAlturaNo(int alturaNo) {
		this.alturaNo = alturaNo;
	}

	public int getProfundidadeNo() {
		return profundidadeNo;
	}

	public void setProfundidadeNo(int profundidadeNo) {
		this.profundidadeNo = profundidadeNo;
	}

	
}
