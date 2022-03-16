package Vendas;

import Cliente.Cliente;
import ItensVenda.ControleItensDeVenda;


public class Vendas {
	
	private int id; 
	private double valorDaVenda; 
	private Cliente cli;
	private ControleItensDeVenda listaItensDeVenda; 
	private String DatadaVenda;  
	
	
	public Vendas(int id, Cliente cli, ControleItensDeVenda listaItensDeVenda,String DatadaVenda,double valorDaVenda ) {
		setId(id);
		setValorDaVenda(valorDaVenda);
		setCli(cli);
		setItens(listaItensDeVenda);
		setDatadaVenda(DatadaVenda);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorDaVenda() {
		return valorDaVenda;
	}
	public void setValorDaVenda(double valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public ControleItensDeVenda getItens() {
		return listaItensDeVenda;
	}
	public void  setItens(ControleItensDeVenda listaItensDeVenda) {
		this.listaItensDeVenda = listaItensDeVenda;
	}
	
	public String getDatadaVenda() {
		return DatadaVenda;
	}
	public void setDatadaVenda(String DatadaVenda) {
		this.DatadaVenda = DatadaVenda;
	}
	

	
	public void imprimirItensDeVenda() {
		System.out.println("Id da Venda: "+this.id);
		System.out.println("Data da Venda: " + this.DatadaVenda);
		System.out.println("Nome do Cliente: "+this.cli.getNome()+" CPF: "+cli.getCPF());
		ControleItensDeVenda.listarItensDeVenda();
		System.out.println("Valor da Venda: " + this.valorDaVenda);
		System.out.println();
	}
	
}