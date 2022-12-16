
public class DecimaisDinheiro {

	String nota;
	int quantidade;
	Double valor;
	String tipo;

	public DecimaisDinheiro(String nota, int quantidade, Double valor, TipoMonetario tipo) {
		this.nota = nota;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipo = tipo.name();
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
