package animal;

public class Gorila extends Animal {
	 public Gorila () {
		 super ("[gorila]");
		 }

		 @Override //Anota��o de sobrescrita/reescrita de m�todo.
		 public void emitirSom () {
		 System.out.println ("Som de gorila.");
		 }


}
