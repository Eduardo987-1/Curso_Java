package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantpecas1,quantpecas2,numpecas1,numpecas2;
		Double valorpeca1,valorpeca2,resultado;
		numpecas1 = sc.nextInt();
		quantpecas1 = sc.nextInt();
		valorpeca1 = sc.nextDouble();
		quantpecas2 = sc.nextInt();
		numpecas2 = sc.nextInt();
		valorpeca2 = sc.nextDouble();
		resultado = valorpeca1 * quantpecas1 + valorpeca2 * numpecas2;
		System.out.println("Valor a pagar:  "+ resultado);
	}

}
