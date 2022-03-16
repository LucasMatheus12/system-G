package Vendas;

import java.util.ArrayList;
import java.util.Scanner;

import Cliente.Cliente;
import Cliente.ControledeClientes;
import Produto.Produto;
import Produto.ListadeProdutos;
import ItensVenda.ItensDeVenda;
import ItensVenda.ControleItensDeVenda;

public class ListadeVendas {

		public static ArrayList<Vendas> listaDeVendas;

		public ListadeVendas() {
			ListadeVendas.listaDeVendas = new ArrayList<>();

		}

		public void insereVendas(Vendas novavenda) {
			listaDeVendas.add(novavenda);
		}

		public void listarVendas() {
			System.out.println("\nLista de Vendas\n");

			for (Vendas vendas : listaDeVendas) {
				vendas.imprimirItensDeVenda();
			}
		}

		public static Vendas getVendas(int id_vend) {

			for (Vendas vendas : listaDeVendas) {

				if (vendas.getId() == (id_vend)) {

					return vendas;
				}
			}

			return null;

		}

		public static void remover(int id_vend) {

			for (Vendas vendas : listaDeVendas) {

				if (vendas.getId() == (id_vend)) {

					listaDeVendas.remove(vendas);
					System.out.println("Venda removida com sucesso!");

					break;
				}
			}
		}

		public static void Menu_venda() {
			System.out.println("1- Alterar Cliente:\n");
			System.out.println("2- Alterar Data da Venda:\n");
			System.out.println("0- Sair");

		}

		public static Vendas Altera_venda() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Informe o ID da venda para alteração: \n");
			int id = teclado.nextInt();
			teclado.nextLine();

			Vendas vend = getVendas(id);
			if (vend != null) {
				int op;
				do {
					Menu_venda();

					op = teclado.nextInt();
					teclado.nextLine();
					switch (op) {
					case 1:
						System.out.println("Digite o CPF do novo Cliente: ");
						String cpf_Cli = teclado.nextLine();
						Cliente clien = ControledeClientes.getCliente(cpf_Cli);
						vend.setCli(clien);
						break;
					case 2:
						System.out.println("Digite a nova Data da Venda: ");
						String nova_data = teclado.nextLine();
						vend.setDatadaVenda(nova_data);
						break;
					case 0:
						System.out.println("Saindo...");
						break;
					}
				} while (op == 0);

			}

			return vend;
		}

		public static void menuPagamento() {
			System.out.println("1- Dinheiro");
			System.out.println("2- Pic Pay");
			System.out.println("3- Boleto");
			System.out.println("4- Cartão");
			System.out.println("5- Pix");
			System.out.println("0- Sair");
		}

		public static Vendas Pagamento() {
			System.out.println("Informe o ID da venda para o pagamento:");
			Scanner teclado = new Scanner(System.in);
			int id_venda_pag = teclado.nextInt();
			teclado.nextLine();
			Vendas pagamento = getVendas(id_venda_pag);

			int opc;
			System.out.println("Informe o método de pagamento:");
			do {
				menuPagamento();
				opc = teclado.nextInt();
				teclado.nextLine();
				if(opc != 0) {
				System.out.println("Informe o valor do pagamento:");
				double haver = teclado.nextDouble();
				pagamento.setValorDaVenda(pagamento.getValorDaVenda() - haver);

				switch (opc) {
				case 1:
					System.out.println("Valor Recebido em dinheiro: " + haver + " Valor da venda com haver: "
							+ pagamento.getValorDaVenda());
					break;

				case 2:
					System.out.println("Valor Recebido em Pic Pay: " + haver + " Valor da venda com haver: "
							+ pagamento.getValorDaVenda());
					break;
				case 3:
					System.out.println("Valor Recebido em Boleto: " + haver + " Valor da venda com haver: "
							+ pagamento.getValorDaVenda());
					break;
				case 4:
					System.out.println("Valor Recebido em Cartão: " + haver + " Valor da venda com haver: "
							+ pagamento.getValorDaVenda());
					break;
				case 5:
					System.out.println("Valor Recebido em PIX: " + haver + " Valor da venda com haver: "
							+ pagamento.getValorDaVenda());
					break;
				case 0:
					System.out.println("Saindo ...");
					break;
				}
				System.out.println("Deseja fazer um Novo  pagamento?");
				}
				
			} while (opc != 0);
			

			return pagamento;
		}
		

		public static void getVendasNaoPagas() {

			for (Vendas vendas : listaDeVendas) {

				if (vendas.getValorDaVenda() != 0.00) {

					vendas.imprimirItensDeVenda();

				}
			}

		}
		public static Vendas AdicionarVenda() {
			System.out.println("Insira o CPF do cliente: ");
			Scanner teclado = new Scanner(System.in);
			String cpf_Cli = teclado.nextLine();
			Cliente clien = ControledeClientes.getCliente(cpf_Cli);
			System.out.println("\nData da Venda: ");
			String DatadaVenda = teclado.next();
			int inserirProd;
			ItensDeVenda itenss;
			ControleItensDeVenda controleItensDeVenda = new ControleItensDeVenda();
			double valor_venda;
			System.out.println("Insira o codigo do produto desejado: ");
			int cod_prod = teclado.nextInt();
			teclado.nextLine();
			Produto prod = ListadeProdutos.getProduto(cod_prod);
			System.out.println("Insira a quantidade de produtos para a venda: ");
			int qtd_prod_venda = teclado.nextInt();
			teclado.nextLine();
			itenss = new ItensDeVenda(prod,qtd_prod_venda);
			controleItensDeVenda.insereItensDeVenda(itenss);
			controleItensDeVenda.listarItensDeVenda();
			prod.setQtdProd(prod.getQtdProd() - qtd_prod_venda);
			valor_venda = prod.getValor() * itenss.getQtdProduto();
			double valorOfc = valor_venda;
			do {
			System.out.println("Deseja inserir mais produtos?");
			System.out.println("-- 1-Sim ---");
			System.out.println("-- 0-Não ---");
			inserirProd = teclado.nextInt();
			teclado.nextLine();
			if(inserirProd == 1) {
			System.out.println("Insira o codigo do produto desejado: ");
			int cod_prods = teclado.nextInt();
			teclado.nextLine();
			prod = ListadeProdutos.getProduto(cod_prods);
			System.out.println("Insira a quantidade de produtos para a venda: ");
			int qtd_prod_vendas = teclado.nextInt();
			teclado.nextLine();
			itenss = new ItensDeVenda(prod,qtd_prod_vendas);
			controleItensDeVenda.insereItensDeVenda(itenss);
			controleItensDeVenda.listarItensDeVenda();
			prod.setQtdProd(prod.getQtdProd() - qtd_prod_vendas);
			double valor_vendas = prod.getValor() * itenss.getQtdProduto();
			 valorOfc += valor_vendas;
			}
			}while(inserirProd != 0);
			System.out.println("Insira o Numero da venda: ");
			int id_vend = teclado.nextInt();
			teclado.nextLine();
			Vendas novaVenda = new Vendas(id_vend, clien, controleItensDeVenda, DatadaVenda, valorOfc);
			novaVenda.imprimirItensDeVenda();;
			return novaVenda;
		}

	}
