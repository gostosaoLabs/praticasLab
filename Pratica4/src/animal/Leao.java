package animal;

public class Leao extends Animal{
	 public Leao () {
		 super ("[leao]");
		 }

		 @Override //Anota��o de sobrescrita/reescrita de m�todo.
		 public void emitirSom () {
		 System.out.println ("Som de leao.");
		 }

	

}
