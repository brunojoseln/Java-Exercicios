package pacote;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaCliente {
	ArrayList<Cliente> cadastroCliente;
	
	//Declaração de variaveis
	int id,idade,tamanho;
	String nome,telefone;
	
	//Construtor
	public ListaCliente(){
		cadastroCliente = new ArrayList<Cliente>();
		id =0;
		idade =0;
		tamanho = 0;
		nome = "";
		telefone="";
	}
	
	public void cadastrar(){
		//mensagem informativa
		JOptionPane.showMessageDialog(null, "Cadastro de cliente");
		
                try {
                    while (true) {
			id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"+"\n \n Digite 0 para voltar ao menu"));
			//verifica se o usuário digitou 0
			
			if (id <=0) {
				break; //para o laço
			}
			
			//Recebe os dados
			nome = JOptionPane.showInputDialog("Digite o nome do cliente");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente"));
			telefone = JOptionPane.showInputDialog("Insira o telefone do cliente");
			
			
			//O comando add adiciona os itens na lista
			cadastroCliente.add(new Cliente(id,nome,idade,telefone));
			JOptionPane.showMessageDialog(null, "Cliente com o id "+id+" cadastrado com sucesso");
		}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Insira um valor válido");
            }
                
		
		
	}
	
	public void ExibirTotal(){
		tamanho = cadastroCliente.size();
                
                // o metodo cadastro.cliente.size()== 0 também funciona no if
                if (cadastroCliente.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há clientes cadastrados");
            }else{
                    JOptionPane.showMessageDialog(null, "Total de clientes cadastrados: "+tamanho);
                }
                
		
	}
	
	public void imprimirLista(){
            //Verifica se o arraylist está vazio
            if (cadastroCliente.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Não há clientes cadastrados");
            }else{
                for (int i = 0; i < cadastroCliente.size(); i++) {
			cadastroCliente.get(i).imprimir();
		}
            }
            	
	}

	public void buscarLista() {
            //Variável que irá conferir se o id existe no arrayList
            boolean ex = false;    
    
            //Variavel que recebe o id que será consultado
            int consul = Integer.parseInt(JOptionPane.showInputDialog("Insira o id a ser consultado: "));
            
           //For que ira verificar o ArrayList
            for (Cliente cliente : cadastroCliente) {
                if (consul == cliente.getId()) {
                    cliente.imprimir();
                    ex = true;
                    continue;
                    }
                //Quando o consul for igual ao cliente.getId() o bloco vai parar de procurar e vai continuar
                continue;
                }
            //Caso a consulta não retorne nenhum valor a variavel ex vai continuar valnedo false
                if (ex == false) {
                    JOptionPane.showMessageDialog(null,"Cliente não existe");
                }
            }
	
	
	public void excluir(){
            //recebe o id do registro que será apagado 
            int apagar = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do cliente que será excluído: "));
            for (int i = 0; i < cadastroCliente.size(); i++) {
                Cliente c = cadastroCliente.get(i);
                
                //Se o id for igual ao id que o usuário digirou então entrará no if
                if (c.getId() == apagar) {
                    cadastroCliente.remove(c);
                    break;
                }
            }
	}
}
