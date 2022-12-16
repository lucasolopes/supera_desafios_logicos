import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

        int tamanhoArray = input.nextInt();
        int valorAlvo = input.nextInt();
		
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int c= 0; c< tamanhoArray; c++) {
        	int entradaArray = input.nextInt();
        	array.add(entradaArray);
        }
        
        Integer quantidadeIgualdadeAlgo = 0;
        for (Integer primeiroValor : array) {
			for (Integer segundoValor : array) {
				if(primeiroValor - segundoValor == valorAlvo)
					quantidadeIgualdadeAlgo++;
			}
		}
        
        System.out.println(quantidadeIgualdadeAlgo);
		
	}
}
