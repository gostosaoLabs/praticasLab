package pessoa;

public class Pessoa {

	private String nome;
	String endereco;
	int telefone;
	
	
	
	//Construtores
	public Pessoa(){
		setTelefone(0);
		setNome("Vazio");
		setEndereco("Vazio");
	}
	 public Pessoa(String nome,int telefone,String endereco) {
		 	setNome(nome);
		 	setTelefone(telefone);
		 	setEndereco(endereco);	
}
	 
	 public String getIdentificacao () {
		 return this.getNome () + ", " +
		 this.getTelefone () + ", " +
		 this.getEndereco () + ".";
		 }
	
	
	 
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	 public String getEndereco(){
		 return endereco;
		
	 }
	 public void setEndereco(String endereco){
		this.endereco = endereco;
	 }

}
