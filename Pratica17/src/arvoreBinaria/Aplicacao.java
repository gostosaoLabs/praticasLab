package arvoreBinaria;

public class Aplicacao {

	public static void main(String[] args) {
		
		Arvore tree = new Arvore(4);
		tree.insere(2);
		tree.insere(1);
		tree.insere(10);
		tree.insere(3);
		tree.insere(11);
		tree.insere(8);
		tree.insere(6);
		tree.insere(5);
		tree.remove(5);
	//	tree.remove(10);
	//	tree.remove(8);
/*	System.out.println("Pré-ordem:");
	tree.preOrdem();
	System.out.println();
	System.out.println("Pós-ordem:");
	tree.posOrdem();
	System.out.println();
	System.out.println("Em ordem:");
	tree.emOrdem();
	System.out.println();
	System.out.println("Largura:");
	tree.largura();
	System.out.println("\nAltura do nó [6]: "+tree.pesquisaNo(6).getAlturaNo());
	*/
		tree.largura();
	System.out.println("Profundidade do nó [6]: "+tree.pesquisaNo(6).getProfundidadeNo());
	
	System.out.println(tree.getAltura());
	//System.out.println(tree.getProfundidade());
	
	//System.out.println(tree.existeNaArvore(10));
	tree.salvarArquivo();

	//System.out.println("Altura[4]: "+tree.pesquisaNo(4).getAlt());
	//System.out.println("balanceado[5]: "+tree.pesquisaNo(5).balanceado());
	//System.out.println("balanceado[4]: "+tree.pesquisaNo(4).balanceado());
	//System.out.println("balanceado[3]: "+tree.pesquisaNo(3).balanceado());
	//System.out.println(tree.pesquisaNo(5).balanceado());
	
	/*gravar.gravar("==========Arvore========== ");
	gravar.gravar("Nodos: "+result);
	gravar.gravar("Altura da árvore: "+this.getAltura());
	gravar.gravar("Profundidade da árvore: "+this.getProfundidade());
*/
	}

}
