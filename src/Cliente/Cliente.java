package Cliente;


public class Cliente {
	private String nome, CPF, telefone;
	private String cidade, rua, bairro;
	private int numerodacasa;

		public Cliente(String nome, String CPF, String telefone, String cidade, String bairro, String rua, int numerodacasa) {
			setNome(nome);
			setCPF(CPF);
			setTelefone(telefone);
			setCidade(cidade);
			setBairro(bairro);
			setRua(rua);
			setNumerodaCasa(numerodacasa);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String CPF) {
			this.CPF = CPF;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public int getNumerodaCasa() {
			return numerodacasa;
		}

		public void setNumerodaCasa(int numerodacasa) {
			this.numerodacasa = numerodacasa;
		}

		public void imprimir() {
			System.out.println("Nome: " + this.nome);
			System.out.println("CPF: " + this.CPF);
			System.out.println("Telefone: " + this.telefone);
			System.out.println("Cidade: " + this.cidade);
			System.out.println("Bairro: " + this.bairro);
			System.out.println("Rua: " + this.rua);
			System.out.println("NumeroDaCasa: " + this.numerodacasa);
			System.out.println();
		}
	}

