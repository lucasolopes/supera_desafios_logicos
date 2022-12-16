import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	Scanner input = new Scanner(System.in);
    	int quantidade = input.nextInt();
    	ArrayList<String> linha = new ArrayList<>();
    	for(int c = 0; c<=quantidade;c++) {
    		linha.add(input.nextLine());
    	}
    	
    	linha.forEach(texto -> 
    		{
				String parte1 = new StringBuilder(texto.substring(0, texto.length()/2)).reverse().toString();
				String parte2 = new StringBuilder(texto.substring(texto.length()/2)).reverse().toString();
				String decifrado = parte1+parte2;
				System.out.println(decifrado);
			}
    	);


    }
}
