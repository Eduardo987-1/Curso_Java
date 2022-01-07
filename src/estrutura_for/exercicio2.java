package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int numero;
		int intervalodentro = 0;
		int intervalofora = 0;
		for(int i = 0;i < n;i++) {
		numero = sc.nextInt();
		
		if(numero > 9  && numero < 21) {
			intervalodentro += +1;
		}else {
			intervalofora += +1;
		}
			
		}
		System.out.println(intervalodentro + " in");
		System.out.println(intervalofora + " out");
	}

}
