package ItensVenda;

import java.util.ArrayList;

import Vendas.Vendas;

public class ControleItensDeVenda {
	
public static ArrayList<ItensDeVenda> controleItensDeVenda = new ArrayList<>();
	
	public ControleItensDeVenda() {
	
		ControleItensDeVenda.controleItensDeVenda = new ArrayList<ItensDeVenda>();
		
	}
	
	public void insereItensDeVenda(ItensDeVenda itensDeVenda) {
		controleItensDeVenda.add(itensDeVenda);
		
	}
	
	public static  void listarItensDeVenda() {
		System.out.println("\nLista dos itens de venda\n");
		
		for(ItensDeVenda itensDeVenda : controleItensDeVenda) {
			itensDeVenda.imprimirItensDeVenda();
			System.out.println();
		}
	}
	public static ItensDeVenda buscaItens(int cod_P) {

		for (ItensDeVenda itensv : controleItensDeVenda) {

			if (itensv.getProduto().getCodigo() ==(cod_P)) {

				return itensv;
			}
		}

		return null;

	}
	
	public static void removerProdItensDeVenda(ItensDeVenda item) {

		for (ItensDeVenda items : controleItensDeVenda) {

			if (items == (item)) {
				controleItensDeVenda.remove(item);
				System.out.println("Item removido com sucesso!");

				break;
			}
		}
	}
	
}
