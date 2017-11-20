package recursividade;

public class Potenciacao {

	public int potenciacao(int base, int expoente){
		int result = 1;
		if(expoente<0)result= -1;
		if(expoente==1)return base;
		else {
		if(expoente>1) {
			result = base*potenciacao(base,expoente-1);
		}
	}
		return result;
	}
}
