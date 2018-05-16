package pacote;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
                //Instanciando
		ListaCliente lista = new ListaCliente();
		int op = -1;
		
                
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Principal \n 1 - Cadastrar \n 2 - Exibir total de clientes cadastrados \n"
					+ "3 - Exibir clientes cadastrados \n 4 - Buscar clientes \n"
					+ "5 - Excluir um cliente \n 0 - Sair "));
			
			switch (op) {
			
			case 1:
				lista.cadastrar();
				break;
				
			case 2:
				lista.ExibirTotal();
				break;
				
			case 3:
				lista.imprimirLista();
				break;
				
			case 4:
				lista.buscarLista();
				break;
				
			case 5:
				lista.excluir();
				break;
				
			case 0:
				continue;
				
			default:
				JOptionPane.showMessageDialog(null, "Valor Inválido");
				break;
			}
			
			
		} while (op != 0);
		
		JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema :)");

	}

}
