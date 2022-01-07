package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i = 0;i < n;i++) {
			Double a = sc.nextDouble();
			Double b = sc.nextDouble();
			Double c = sc.nextDouble();
			Double media = (a * 2.00 + b * 3.00 + c * 5.00) /10.0;
			System.out.println(media);
		}
		
	}

}
