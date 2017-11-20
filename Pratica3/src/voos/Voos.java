package voos;

public abstract class Voos {

	private int id;
	private double preco;
	private String origem;
	private String destino;
	private	Data data;
	
	
	 Voos(int id, double preco,String origem, String destino, Data data){
		
		setId(id);
		setPreco(preco);
		setOrigem(origem);
		setDestino(destino);
		setData(data);
		
	}
	
	public String dadosVoo() {
		return "ID: "+getId()+
				"\nPreço: "+getPreco()+
				"\nOrigem: "+getOrigem()+
				"\nDestino: "+getDestino()+
				"\nData: " + data.toString();
	}
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
}
