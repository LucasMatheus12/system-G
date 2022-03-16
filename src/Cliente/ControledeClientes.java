package Cliente;

import java.util.ArrayList;
import java.util.Scanner; 

public class ControledeClientes {

		public static ArrayList<Cliente> ListagemDeClientes = new ArrayList<>();

		public ControledeClientes() {
			ControledeClientes.ListagemDeClientes = new ArrayList<Cliente>();
		}

		public void inserecliente(Cliente novoCliente) {
			ListagemDeClientes.add(novoCliente);
			
		}

		public void listarclientes() {
			System.out.println("Lista de Clientes");

			for (Cliente clientenalista : ListagemDeClientes) {
				clientenalista.imprimir();
			}
		}

		public static Cliente getCliente(String CPF) {

			for (Cliente cliente : ListagemDeClientes) {

				if (cliente.getCPF().equals(CPF)) {

					return cliente;

				}

			}

			return null;

		}
		
		public static void remove(String CPF) {
			for (Cliente cliente : ListagemDeClientes) {			
				if (cliente.getCPF().equals(CPF)) {
					ListagemDeClientes.remove(cliente);
					System.out.println("Cliente removido com sucesso!");
					break;
				}

			}

		}
		public static void Menu_cliente() {
			 System.out.println("1- Alterar Nome:\n");
			 System.out.println("2- Alterar CPF:\n");
			 System.out.println("3- Alterar Telefone:\n");
			 System.out.println("4- Alterar Endereço:\n");
			 System.out.println("0- Sair");
			 }
		
		public static Cliente Altera_cli() {
			Scanner teclado = new Scanner(System.in); 
			System.out.println("Informe o CPF do cliente para ser alterado: \n");
			String cpf = teclado.nextLine();  
			
		Cliente cli = getCliente(cpf); 
		if(cli != null) {
			int op; 
			do {
			Menu_cliente(); 
			
		op =teclado.nextInt();
		teclado.nextLine();
		
		switch(op) {
		case 1: 
			System.out.println("Digite o novo nome do cliente: ");
			String Novo_Nome = teclado.nextLine(); 
	        cli.setNome(Novo_Nome);
			break;
		case 2: 
			System.out.println("Digite o novo CPF do cliente: ");
			String Novo_CPF = teclado.nextLine(); 
	        cli.setCPF(Novo_CPF);
			break;
		case 3: 
			System.out.println("Digite o novo telefone do cliente: ");
			String Novo_Telefone = teclado.nextLine(); 
	        cli.setTelefone(Novo_Telefone);
			break; 
		case 4: 
			System.out.println("Digite o novo endereço do cliente: ");
			System.out.println("Digite a nova cidade: ");
			String Novo_cidade = teclado.nextLine(); 
	        cli.setCidade(Novo_cidade);
	        System.out.println("Digite o novo bairro: ");
	        String Novo_Bairro = teclado.nextLine(); 
	        cli.setBairro(Novo_Bairro);
	        System.out.println("Digite a nova rua: ");
	        String Novo_Rua = teclado.nextLine(); 
	        cli.setRua(Novo_Rua);
	        System.out.println("Digite o novo Numero da casa: ");
	        int Novo_Num = teclado.nextInt(); 
	        teclado.nextLine(); 
	        cli.setNumerodaCasa(Novo_Num); 
	        
			break; 
		case 0: 
			System.out.println("Saindo...");
			break; 
		
		}
		
			}while(op != 0);
		}
		return cli; 
	}
	}

