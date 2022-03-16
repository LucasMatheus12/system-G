package Produto;

public class Produto {

		private String nome_P;
		private int cod_P;
		private String desc_P;
		private double valor_P;
		private int qtd_prod;
		
		
		public Produto(String nome_P,int cod_P, String desc_P, double valor_P, int qtd_prod ) {
			setNome(nome_P);
			setCodigo(cod_P);
			setDescricao(desc_P);
			setValor(valor_P);
			setQtdProd(qtd_prod);
		}
		
		public String getNome() {
			return nome_P;
		}
		public void setNome(String nome_P) {
			this.nome_P = nome_P;
		}
		
		public int getCodigo() {
			return cod_P;
		}
		public void setCodigo(int cod_P) {
			this.cod_P = cod_P;
		}
		
		public String getDescricao() {
			return desc_P;
		}
		public void setDescricao(String desc_P) {
			this.desc_P = desc_P;
		}
		
		public double getValor() {
			return valor_P;
		}
		public void setValor(double valor_P) {
			this.valor_P = valor_P;
		}
		public int getQtdProd() {
			return qtd_prod;
		}
		public void setQtdProd(int qtd_prod) {
			this.qtd_prod = qtd_prod; 
		}
		
		public void imprimir() {
			System.out.println("Nome: " + this.nome_P);
			System.out.println("Codigo: " + this.cod_P);
			System.out.println("Descrição: " + this.desc_P);
			System.out.println("Valor: " + this.valor_P);
			System.out.println("Quantidade: " +this.qtd_prod);
			System.out.println();
		}

		
		
		
	}

