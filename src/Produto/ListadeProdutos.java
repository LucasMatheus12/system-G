package Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ListadeProdutos {
	public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();
	
	public ListadeProdutos() {
		ListadeProdutos.listaDeProdutos = new ArrayList<Produto>();
		
	}
	
	public void insereProd(Produto prod) {
		listaDeProdutos.add(prod);
	}
	
	public void listarProdutos() {
		System.out.println("\nLista de Produtos\n");
		
		for(Produto p : listaDeProdutos) {
			p.imprimir();
			System.out.println();
		}
	}
	
	public static Produto getProduto(int cod_P) {

		for (Produto produto : listaDeProdutos) {

			if (produto.getCodigo() ==(cod_P)) {

				return produto;
			}
		}

		return null;

	}
	
	public static void remover(int cod_P) {
		
		for (Produto produto : listaDeProdutos) {
		
			if (produto.getCodigo() ==(cod_P)) {
			
				listaDeProdutos.remove(produto);
				System.out.println("Produto removido com sucesso!");
				
				break;
			}
		}
	}
	public static void Menu_produto() {
		 System.out.println("1- Alterar Nome:\n");
		 System.out.println("2- Alterar Codigo:\n");
		 System.out.println("3- Alterar Descri��o:\n");
		 System.out.println("4- Alterar Valor:\n");
		 System.out.println("5- Alterar Quantidade de produto:\n");
		 System.out.println("0- Sair");
		 
		 }
	public static Produto Altera_pro() {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Informe o codigo do produto para ser alterado: \n");
		int cod = teclado.nextInt(); 
		teclado.nextLine(); 
		
		Produto pro = getProduto(cod);  
		if(pro != null) {
			int op; 
			do {
			Menu_produto(); 
			
		op =teclado.nextInt();
		teclado.nextLine();
		switch(op) {
		case 1: 
			System.out.println("Digite o novo nome do produto: ");
			String Novo_nome = teclado.nextLine(); 
			pro.setNome(Novo_nome);
			break; 
		case 2: 
			System.out.println("Digite o novo codigo do produto: ");
			int Novo_codigo = teclado.nextInt(); 
			teclado.nextLine(); 
			pro.setCodigo(Novo_codigo);
			break;
		case 3: 
			System.out.println("Digite o nova descri��o do produto: ");
			String Novo_desc = teclado.nextLine(); 
			pro.setDescricao(Novo_desc);
			break;
		case 4: 
			System.out.println("Digite o novo valor do produto: ");
			double Novo_valor = teclado.nextFloat(); 
			pro.setValor(Novo_valor);
			break;
		case 5: 
			System.out.println("Digite o nova quantidade do produto: ");
			int Novo_qtd = teclado.nextInt(); 
			teclado.nextLine(); 
			pro.setQtdProd(Novo_qtd);
			break;
		case 0:
			System.out.println("Saindo...");
			break; 
		}
		}while(op != 0);
	
}
		return pro; 
	}
}