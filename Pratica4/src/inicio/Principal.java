package inicio;

import animal.Animal;
import animal.Zebra;
import animal.Elefante;
import animal.Urso;
import animal.Leao;
import animal.Gorila;

public class Principal {

	public static void main(String[] args) {
		Animal[] zoologico = new Animal[10];
		
		zoologico[0] = new Zebra();
		zoologico[1] = new Elefante();
		zoologico[2] = new Urso();
		zoologico[3] = new Leao();
		zoologico[4] = new Gorila();
		zoologico[5] = new Elefante();
		zoologico[6] = new Gorila();
		zoologico[7] = new Urso();
		zoologico[8] = new Zebra();
		zoologico[9] = new Leao();
	
		for(int i = 0; i < zoologico.length;i++) {
			zoologico[i].emitirSom();
		}
	}

}
