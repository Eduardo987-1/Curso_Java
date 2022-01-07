package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double numero = sc.nextDouble();
		if(numero < 0 || numero > 100) {
			System.out.println("Numero fora do intervalo!");
		}else if(numero <= 25.0){
			System.out.println("Intervalo[0,25]");
		}else if(numero <= 50.0){
			System.out.println("Intervalo[0,50]");
		}else if(numero <= 75.0){
			System.out.println("Intervalo[50,75]");
		}else{
			System.out.println("Intevalo [75,100]");
		}
	}

}
