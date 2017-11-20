package voos;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minutos;
	
	public Data(int dia, int mes, int ano, int hora, int minutos){
		setDia(dia);
		setMes(mes);
		setAno(ano);
		setHora(hora);
		setMinutos(minutos);
	}
	
	public String toString() {
		return  getDia()+
				"/" + getMes()+
				"/" + getAno()+
				" "+ getHora()+":"+
				getMinutos();
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	
}
