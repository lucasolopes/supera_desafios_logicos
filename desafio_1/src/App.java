import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int valorMax = 100000;
        int valorMin = 1;

        Scanner entradaQuantidade = new Scanner(System.in);
        Integer n = entradaQuantidade.nextInt();

        ArrayList<Integer> valoresPar = new ArrayList<>();
        ArrayList<Integer> valoresImpar = new ArrayList<>();

        if (n <= valorMax && n > valorMin) {
            for (int c = 0; c < n; c++) {
                Integer valor = entradaQuantidade.nextInt();
                if (pegarTipo(valor) == tipo.PAR) {
                    valoresPar.add(valor);
                } else if (pegarTipo(valor) == tipo.IMPAR) {
                    valoresImpar.add(valor);
                }
            }

            Collections.sort(valoresPar);
            valoresImpar.sort(Collections.reverseOrder());

            valoresPar.forEach(System.out::println);
            valoresImpar.forEach(System.out::println);
        }
    }

    private static tipo pegarTipo(Integer numero) {
        if (numero % 2 == 0)
            return tipo.PAR;
        else
            return tipo.IMPAR;
    }
}
