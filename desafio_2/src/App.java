import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    	NumberFormat nformat = NumberFormat.getInstance(Locale.US);
    	
    	Scanner input = new Scanner(System.in);

        Double valorTotal = nformat.parse(input.nextLine()).doubleValue();
        Double centavos = (valorTotal*100.0)%100;
        
        ArrayList<InteirosDinheiro> listaInteirosDinheiro = new ArrayList<>();
        ArrayList<DecimaisDinheiro> listaDecimaisDinheiro = new ArrayList<>();
        

        Valores.getValoresInteiros().forEach(valor -> listaInteirosDinheiro.add(new InteirosDinheiro(valor, 0, Double.parseDouble(valor), TipoMonetario.MOEDA)));
        Valores.getValoresDecimais().forEach(valor -> listaDecimaisDinheiro.add(new DecimaisDinheiro(valor, 0, Double.parseDouble(valor), TipoMonetario.MOEDA)));
        
        
        for (InteirosDinheiro dinheiro : listaInteirosDinheiro) {
        	double quantidade;
        	 
        	quantidade = valorTotal/dinheiro.getValor();
        	valorTotal %= dinheiro.getValor();	
        	System.out.println((int) quantidade +" "+ dinheiro.getTipo()+ "(s)(s) de R$ "+dinheiro.getNota());
		}
        
        for(DecimaisDinheiro dinheiro : listaDecimaisDinheiro) {
        	int quantidade; 
        	
        	quantidade = (int) (centavos/(dinheiro.getValor()*100));
        	centavos%=dinheiro.getValor()*100;
        	System.out.println((int) quantidade +" "+ dinheiro.getTipo()+ "(s)  de R$ "+dinheiro.getNota());
        }
        
    }

}
