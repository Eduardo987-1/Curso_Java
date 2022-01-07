package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double resultado,raio,pi = 3.14159;
		raio = sc.nextDouble();
		resultado = raio * raio * pi;
		System.out.println("resultado: " + resultado);
	}

}
