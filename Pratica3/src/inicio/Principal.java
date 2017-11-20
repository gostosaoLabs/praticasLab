package inicio;
import pessoa.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		
		JOptionPane.showMessageDialog(null,"Bem-Vindo ao Programa");
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"1- PessoaJuridica \n2-PessoaFisica"));
		if(opcao< 1 || opcao >2) {
			System.out.println("Opção Inválida. Encerrando programa...");
			System.exit(0);
		}
		
		String nome = (JOptionPane.showInputDialog(null,"Digite o nome: "));
		JOptionPane.showMessageDialog(null, "Nome: " + nome);
		int telefone =(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o telefone: ")));
		JOptionPane.showMessageDialog(null, "Telefone: " + telefone);
		
		String endereco = (JOptionPane.showInputDialog(null,"Digite o endereço: "));
		JOptionPane.showMessageDialog(null, "Endereço: " + endereco);
		
		Pessoa p = new Pessoa();
		if(opcao == 1) {
			
		String cnpj = (JOptionPane.showInputDialog(null,"Digite o CNPJ: "));
		JOptionPane.showMessageDialog(null, "CNPJ: " + cnpj);
		p = new PessoaJuridica(nome, telefone, cnpj, endereco);
	
		}
		else if(opcao == 2) {
			
			String cpf = (JOptionPane.showInputDialog(null,"Digite o CPF: "));
			JOptionPane.showMessageDialog(null, "CPF: " + cpf);
			String rg =  (JOptionPane.showInputDialog(null,"Digite o RG: "));
			JOptionPane.showMessageDialog(null, "RG: " + rg);
			p = new PessoaFisica(nome, telefone, cpf, rg, endereco);
			
		}
		
		JOptionPane.showMessageDialog(null,p.getIdentificacao(),"Identificação",1);
	
	}

}
