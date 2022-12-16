
public class ValoresDinheiro {
	String nota;
	int quantidade;
	Double valor;
	String tipo;
	
	public ValoresDinheiro(String nota, int quantidade, Double valor, String tipo) {
		this.nota = nota;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipo = tipo; 
	}
	
	public String getNota() {
		return nota;
	}

	public int getQuantidade() {
		return quantidade; 
	}

	public Double getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}

}
