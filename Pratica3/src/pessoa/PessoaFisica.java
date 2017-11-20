package pessoa;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private String rg;
	
	public PessoaFisica() {
		setCpf("Vazio");
		setRg("Vazio");
	}
	
	@Override
	 public String getIdentificacao () {
		 return this.getNome () + ", " +
		 this.getTelefone () + ", " +
		 this.getEndereco () + "," +
		 this.getCpf() + "," +
		 this.getRg()+ ".";
	}
	
	public PessoaFisica(String nome,int telefone,String cpf,String rg,String endereco) {
		super(nome,telefone,endereco);
		setCpf(cpf);
		setRg(rg);
		}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
