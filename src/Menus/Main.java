package Menus;

import java.util.Date;
import java.util.Scanner;

import Cliente.Cliente;
import Cliente.ControledeClientes;
import Produto.ListadeProdutos;
import Produto.Produto;
import Vendas.ListadeVendas;
import Vendas.Vendas;
import ItensVenda.ItensDeVenda;
import ItensVenda.ControleItensDeVenda;
import Menus.MenuInteracao;
public class Main {
	
	
	public static void main(String[] args) {

		Date data = new Date();
		System.out.println("Sistema Acessado às: "+data);
		
		int opc,op1;
		String nome, cpf, numero;
		String cidade, rua, bairro;
		int numerodacasa;

		ControledeClientes novalista = new ControledeClientes();
		Cliente novocliente;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Login: ");
		String login = teclado.nextLine();

		System.out.println("Senha: ");
		String senha = teclado.nextLine();

		if (login.equals("SystemG") && senha.equals("SystemG")) {
			System.out.printf("Usuário %s logado com sucesso.", login);
			System.out.println();

			String nome_prod, descri_prod;
			float valor_prod;
			int codigo_prod;
			int qtd_prod;
			ListadeProdutos listaProd = new ListadeProdutos();
			Produto novoProduto;

		
			
			
			ListadeVendas listavendas = new ListadeVendas();
			
			Cliente cliente = new Cliente("Maria", "147852", "84996465312", "Patu", "centro", "nova brasilia", 74);
			novalista.inserecliente(cliente);
			Cliente cliente1 = new Cliente("Lucas", "147896", "84996467485", "Pau dos Ferros", "avenida lauro maia",
					"itaja", 83);
			novalista.inserecliente(cliente1);
			Cliente cliente2 = new Cliente("Paulina", "963852", "84998521474", "Itau", "avenida treze de maio",
					" Cemiterio", 157);
			novalista.inserecliente(cliente2);
			Cliente cliente3 = new Cliente("Emanuela", "122874", "83997857441", "pau dos ferros", "avenida alemanha",
					" nações unidas", 154);
			novalista.inserecliente(cliente3);
			Cliente cliente4 = new Cliente("Alisson", "852963", "83995874125", "Mossoro", "Belo horizonte",
					" pelorinho", 53);
			novalista.inserecliente(cliente4);
			Cliente cliente5 = new Cliente("Mirelly", "762245", "84981035643", "Rafael Fernandes", "centro",
					"nove de maio", 73);
			novalista.inserecliente(cliente5);

			Produto produto0 = new Produto("Camisa", 10, "Camisa branca", 50.00, 5);
			listaProd.insereProd(produto0);
			Produto produto1 = new Produto("Calça", 12, "Calça Jeans", 60.00, 3);
			listaProd.insereProd(produto1);
			Produto produto2 = new Produto("Short", 13, "Short Jeans", 45.00, 4);
			listaProd.insereProd(produto2);
			Produto produto3 = new Produto("Vestido", 11, "Vestido Azul", 40.00, 2);
			listaProd.insereProd(produto3);
			Produto produto4 = new Produto("Macacao", 14, "Florado", 35.00, 1);
			listaProd.insereProd(produto4);
			Produto produto5 = new Produto("t-shir", 15, "Estampada", 25.00, 6);
			listaProd.insereProd(produto5);
			Produto produto6 = new Produto("Short Masculino", 16, "Jeans", 55.00, 3);
			listaProd.insereProd(produto6);
				
			ItensDeVenda itens = new ItensDeVenda(produto1,2);
			ControleItensDeVenda listaItensVenda = new ControleItensDeVenda();
			listaItensVenda.insereItensDeVenda(itens);
			
			Vendas vendas = new Vendas(12, cliente,listaItensVenda, "29/10/2021", 120.00);
			listavendas.insereVendas(vendas);
			Vendas vendas0 = new Vendas(1, cliente1,listaItensVenda, "27/10/2021", 120.00);
			listavendas.insereVendas(vendas0);
			Vendas vendas1 = new Vendas(2, cliente2,listaItensVenda,"30/10/2021", 120.00);
			listavendas.insereVendas(vendas1);

			do {
				
				MenuInteracao.menu1();
				 op1 = teclado.nextInt();
				 teclado.nextLine();
				 if(op1 == 1) {
					 MenuInteracao.menu2();
					 opc = teclado.nextInt();
						teclado.nextLine();
					 switch(opc) {
					 case 1:
							System.out.println("\nNome: ");
							nome = teclado.nextLine();
							System.out.println("\nCPF: ");
							cpf = teclado.nextLine();
							System.out.println("\nNumero de Telefone: ");
							numero = teclado.nextLine();
							System.out.println("\n=====Dados de Endereço=====");
							System.out.println("\nCidade que reside: ");
							cidade = teclado.nextLine();
							System.out.println("\nBairro da resiência: ");
							bairro = teclado.nextLine();
							System.out.println("\nRua da residência: ");
							rua = teclado.nextLine();
							System.out.println("\nNúmero da residência: ");
							numerodacasa = teclado.nextInt();
							teclado.nextLine();
							novocliente = new Cliente(nome, cpf, numero, cidade, bairro, rua, numerodacasa);
							novalista.inserecliente(novocliente);
							break;
						case 2:
							novalista.listarclientes();
							break;
						case 3:
							System.out.println("Informe o CPF do cliente que deseja buscar:");
							String cliente_procurado = teclado.nextLine();
							Cliente recebe_cli = ControledeClientes.getCliente(cliente_procurado);
							recebe_cli.imprimir();
							break;
						case 4:
							System.out.println("Informe o CPF do cliente que deseja remover:");
							String cliente_removido = teclado.nextLine();
							ControledeClientes.remove(cliente_removido);
							break;
						case 5:
							Cliente Cli_altera = ControledeClientes.Altera_cli();
							Cli_altera.imprimir();
							break;
						case 0:
							System.out.println("\nSaindo...");
							break;

						default:
							System.out.println("Opção Invalida !");
							break;
		 
					 }
				 }
				 else if(op1 ==2) {
					 MenuInteracao.menu3();
					 opc = teclado.nextInt();
						teclado.nextLine();
						switch(opc) {
						case 1:
							System.out.println("Insira o nome do Produto\n");
							nome_prod = teclado.nextLine();
							System.out.println("Insira o codigo do Produto\n");
							codigo_prod = teclado.nextInt();
							teclado.nextLine();
							System.out.println("Insira a descrição do Produto\n");
							descri_prod = teclado.nextLine();
							System.out.println("Insira o valor do Produto\n");
							valor_prod = teclado.nextFloat();
							System.out.println("Quantidade de produto\n");
							qtd_prod = teclado.nextInt();
							teclado.nextLine();
							novoProduto = new Produto(nome_prod, codigo_prod, descri_prod, valor_prod, qtd_prod);

							listaProd.insereProd(novoProduto);
							break;
						case 2:
							listaProd.listarProdutos();
							break;
						case 3:
							System.out.println("Informe o codigo do produto que deseja buscar:");
							int produto_procurado = teclado.nextInt();
							teclado.nextLine();
							Produto recebe_prod = ListadeProdutos.getProduto(produto_procurado);
							recebe_prod.imprimir();
							break;
						case 4:
							System.out.println("Informe o codigo do produto que deseja remover:");
							int produto_removido = teclado.nextInt();
							teclado.nextLine();
							ListadeProdutos.remover(produto_removido);
							break;

						case 5:
							Produto Prod_Altera = ListadeProdutos.Altera_pro();
							Prod_Altera.imprimir();
							break;
						case 0:
							System.out.println("\nSaindo...");
							break;

						default:
							System.out.println("Opção Invalida !");
							break;

						}
				 }
				 else if(op1 == 3) {
					 MenuInteracao.menu4();
					 opc = teclado.nextInt();
						teclado.nextLine();
						switch(opc) {
						
				 	case 1:
						System.out.println("O cliente já possui cadastro?");
						System.out.println("1- Sim");
						System.out.println("2- Não");
						int opc2 = teclado.nextInt();
						teclado.nextLine();
						if (opc2 == 1) {
							Vendas novaVendas = ListadeVendas.AdicionarVenda();
							listavendas.insereVendas(novaVendas);
						} else {
							System.out.println("Volte ao menu principal e faça o cadastro do cliente!");
						}

						break;
					case 2:
						listavendas.listarVendas();
						break;
					case 3:
						System.out.println("Informe o ID da venda que deseja buscar:");
						int vend_proc = teclado.nextInt();
						teclado.nextLine();
						Vendas recebe_vend = ListadeVendas.getVendas(vend_proc);
						recebe_vend.imprimirItensDeVenda();
						break;
					case 4:
						System.out.println("Informe o ID da venda que deseja remover:");
						int id_venda_remove = teclado.nextInt();
						teclado.nextLine();
						ListadeVendas.remover(id_venda_remove);
						break;
					case 5:
						Vendas venda_Altera = ListadeVendas.Altera_venda();
						venda_Altera.imprimirItensDeVenda();
						break;
					case 6:
						Vendas pagamento_venda = ListadeVendas.Pagamento();
						pagamento_venda.imprimirItensDeVenda();
						break;
					case 7:
						System.out.println("Relatorio de Vendas Não pagas:");
						ListadeVendas.getVendasNaoPagas();

						break;
					case 8:
						System.out.println("Itens de venda");
						ControleItensDeVenda.listarItensDeVenda();
					case 0:
						System.out.println("\nSaindo...");
						break;

					default:
						System.out.println("Opção Invalida !");
						break;
					}

						
				 }
				 else if(op1 == 0) {
					 System.out.println("Saindo...");
				 }
				 else {
					 System.out.println("opção inválida!");
				 }
			} while (op1 != 0);
		} else {
			System.out.println("Login ou senha inválidos!");
		}
		teclado.close();

	}

}
