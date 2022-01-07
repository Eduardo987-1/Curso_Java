package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dobro,triplo;
		for(int i = 1;i <= n;i++) {
		System.out.print(i);
		dobro = i * i;
		triplo = i * i *i;
		System.out.print(dobro);
		System.out.println(triplo);
		}
	}

}
