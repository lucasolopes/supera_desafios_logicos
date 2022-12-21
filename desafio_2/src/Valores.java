import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Valores {

	// private static final List<String> listDecimais =
	// Collections.unmodifiableList(Arrays.asList(cinquantaCents,vinteCincoCents,dezCents,cincoCents,umCents));

	private static final List<DadosMonetarios> todos = Collections.unmodifiableList(Arrays.asList(
			new DadosMonetarios("100.00", TipoMonetario.NOTA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("50.00", TipoMonetario.NOTA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("20.00", TipoMonetario.NOTA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("10.00", TipoMonetario.NOTA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("5.00", TipoMonetario.NOTA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("2.00", TipoMonetario.NOTA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("1.00", TipoMonetario.MOEDA.name(), TipoValorMonetario.INTEIRO.name()),
			new DadosMonetarios("0.50", TipoMonetario.MOEDA.name(), TipoValorMonetario.DECIMAL.name()),
			new DadosMonetarios("0.25", TipoMonetario.MOEDA.name(), TipoValorMonetario.DECIMAL.name()),
			new DadosMonetarios("0.10", TipoMonetario.MOEDA.name(), TipoValorMonetario.DECIMAL.name()),
			new DadosMonetarios("0.05", TipoMonetario.MOEDA.name(), TipoValorMonetario.DECIMAL.name()),
			new DadosMonetarios("0.01", TipoMonetario.MOEDA.name(), TipoValorMonetario.DECIMAL.name())));

	public static List<DadosMonetarios> getTodosValores() {
		return todos;
	}

}
