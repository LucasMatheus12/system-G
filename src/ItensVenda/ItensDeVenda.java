package ItensVenda;

import Produto.Produto;

public class ItensDeVenda {
		private Produto produto;
		private int qtdProduto;
		
		public ItensDeVenda (Produto produto,int qtdProduto) {
			setQtdProduto(qtdProduto);
			setProduto(produto);
			
		}
		public int getQtdProduto() {
			return qtdProduto;
		}
		public void setQtdProduto(int qtdProduto) {
			this.qtdProduto = qtdProduto; 
		}
		
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		
		public void imprimirItensDeVenda() {
			System.out.println("O produto: "+produto.getNome()+" Valor: "+produto.getValor());
			System.out.println("A quantidade é: "+this.qtdProduto);
			
		}
		
}
