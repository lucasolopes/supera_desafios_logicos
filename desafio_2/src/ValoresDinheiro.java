
public class ValoresDinheiro {
	String nota;
	int quantidade;
	Double valor;
	String tipo;
	String tipoValor;

	public ValoresDinheiro(String nota, int quantidade, Double valor, String tipo, String tipoValor) {
		this.nota = nota;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipo = tipo;
		this.tipoValor = tipoValor;
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

	public String getTipoValor() {
		return tipoValor;
	}

}
