package animal;

public class Animal {
	public String nome;
	 public Animal (String nome) {
	 this.nome = nome;
	 }
	 public String toString () {
	 return getClass ().getSimpleName ();
	 }
	 public void emitirSom () {
	 System.out.println ("Som de animal.");
	 }

}
