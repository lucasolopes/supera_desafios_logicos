import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		NumberFormat nformat = NumberFormat.getInstance(Locale.US);

		Scanner input = new Scanner(System.in);

		Double valorTotal = nformat.parse(input.nextLine()).doubleValue();
		input.close();
		Double centavos = (valorTotal * 100.0) % 100;

		ArrayList<ValoresDinheiro> listaTodosValores = new ArrayList<>();

		Valores.getTodosValores().forEach(valor -> listaTodosValores
				.add(new ValoresDinheiro(valor.getValor(), 0, Double.parseDouble(valor.getValor()), valor.getTipo(),
						valor.getTipoValor())));

		Boolean inicioTipo = true;

		String tipo = TipoValorMonetario.DECIMAL.name();

		for (ValoresDinheiro dinheiro : listaTodosValores) {
			int quantidade;
			if (inicioTipo && tipo != dinheiro.getTipo()) {
				System.out.println(dinheiro.getTipo().toUpperCase() + "S:");
				tipo = dinheiro.getTipo();
				inicioTipo = true;
			}
			if (dinheiro.getTipoValor() == TipoValorMonetario.INTEIRO.name()) {

				quantidade = (int) (valorTotal / dinheiro.getValor());
				valorTotal %= dinheiro.getValor();
			} else {
				quantidade = (int) (centavos / (dinheiro.getValor() * 100));
				centavos %= dinheiro.getValor() * 100;
			}

			System.out.println((int) quantidade + " " + dinheiro.getTipo() + "(s)  de R$ " + dinheiro.getNota());
		}

	}

}
