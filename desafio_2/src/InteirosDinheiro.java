
public class InteirosDinheiro extends Dinheiro {
	

	public InteirosDinheiro(String nota, int quantidade, Double valor, TipoMonetario tipo) {
		this.nota = nota;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipo = tipo.name();
	}

	
}
