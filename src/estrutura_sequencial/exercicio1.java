package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1,n2,soma;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("resultado: " + soma);

	}

}
