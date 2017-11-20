package arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class GravarArq {
	
		
	public GravarArq() {}
	
	public GravarArq(String string) {
		gravar(string);
	}
	
	public void gravar(String string) {
		
		try {
				
			File arq = null;
			FileOutputStream saida = null;
			OutputStreamWriter gravador = null;
			BufferedWriter buffer_saida = null;
		
			arq = new File("arquivo.txt");
			
			saida = new FileOutputStream(arq,true);
			gravador = new OutputStreamWriter(saida);
			buffer_saida = new BufferedWriter(gravador); 
			
			buffer_saida.write(string);
			buffer_saida.newLine();
				
			if(buffer_saida != null)buffer_saida.close();
			if(gravador != null)gravador.close();
			if(saida != null)saida.close();

		}catch(Exception e) {
			System.out.println("ERROR.");
		}
		
		}
		
	}
	
