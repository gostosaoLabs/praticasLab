package animal;

public class Urso extends Animal{
	 public Urso () {
		 super ("[urso]");
		 }

		 @Override //Anota��o de sobrescrita/reescrita de m�todo.
		 public void emitirSom () {
		 super.emitirSom();
		 }

}
