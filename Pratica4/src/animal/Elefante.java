package animal;

public class Elefante extends Animal {
	 public Elefante (){
		 super ("[elefante]");
		 }

		 @Override //Anota��o de sobrescrita/reescrita de m�todo.
		 public void emitirSom () {
		 System.out.println ("Som de elefante.");
		 }

}
