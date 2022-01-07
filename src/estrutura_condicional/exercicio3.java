package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1 % num2 == 0 || num2 % num1 == 0 ) {
			System.out.println("São multiplos");
			
		}
		else {
			System.out.println("Não são multiplos");
		}
	}

}
