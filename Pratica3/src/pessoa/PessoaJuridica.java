package pessoa;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	public PessoaJuridica() {
		setCnpj("Vazio");
	}
	
	
	public PessoaJuridica(String nome,int telefone,String cnpj, String endereco) {
		super(nome,telefone,endereco);
		setCnpj(cnpj);
	}
	
	
	
	@Override
	 public String getIdentificacao () {
		 return this.getNome () + ", " +
		 this.getTelefone () + ", " +
		 this.getEndereco () + "," +
		 this.getCnpj() + ".";
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
