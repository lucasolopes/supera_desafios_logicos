import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Valores {
	

	private static final List<String> listDecimais = 
		    Collections.unmodifiableList(Arrays.asList("0.50","0.25","0.10","0.05","0.01"));

	
	private static final List<String> listInteiros = 
		    Collections.unmodifiableList(Arrays.asList("100.00", "50.00","20.00","10.00","5.00","2.00","1.00"));

	public static List<String> getValoresInteiros() {
		return listInteiros;
	}
	

	
	public static List<String> getValoresDecimais() {
		return listDecimais;
	}
 
	
}
