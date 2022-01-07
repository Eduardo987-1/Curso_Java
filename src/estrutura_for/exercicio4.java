package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			Double a = sc.nextDouble();
			Double b = sc.nextDouble();
			if(b ==0) {
				System.out.println("Divisão impossivel!");
			}else {
				Double resultado = a/b;
				System.out.println(resultado);
			}
		}
	}

}
