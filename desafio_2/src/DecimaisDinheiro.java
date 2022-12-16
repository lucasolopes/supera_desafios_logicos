
public class DecimaisDinheiro extends Dinheiro{

	public DecimaisDinheiro(String nota, int quantidade, Double valor, TipoMonetario tipo) {
		this.nota = nota;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipo = tipo.name();
	}

}
