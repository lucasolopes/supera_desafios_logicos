import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Valores {



//	private static final List<String> listDecimais = 
//		    Collections.unmodifiableList(Arrays.asList(cinquantaCents,vinteCincoCents,dezCents,cincoCents,umCents));

	private static final List<DadosMonetarios> listDecimal = Collections.unmodifiableList(Arrays.asList(
			new DadosMonetarios("0.50",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.25",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.10",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.05",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.01",TipoMonetario.MOEDA.name())
			));
	
	
	
	private static final List<DadosMonetarios> listInteiros = Collections.unmodifiableList(Arrays.asList(
			new DadosMonetarios("100.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("50.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("20.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("10.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("5.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("2.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("1.00", TipoMonetario.MOEDA.name())
			));
	
	
	
	private static final List<DadosMonetarios> todos = Collections.unmodifiableList(Arrays.asList(
			new DadosMonetarios("100.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("50.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("20.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("10.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("5.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("2.00",TipoMonetario.NOTA.name()),
			new DadosMonetarios("1.00", TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.50",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.25",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.10",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.05",TipoMonetario.MOEDA.name()),
			new DadosMonetarios("0.01",TipoMonetario.MOEDA.name())
			));
	

	public static List<DadosMonetarios> getTodosValores() {
		return todos;
	}


	public static List<DadosMonetarios> getValoresInteiros() {
		return listInteiros;
	}

	public static List<DadosMonetarios> getValoresDecimais() {
		return listDecimal;
	}

}
