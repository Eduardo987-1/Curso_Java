package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double x =sc.nextDouble();
		Double y = sc.nextDouble();
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}else if (x == 0.0) {
			System.out.println("Eixo Y");
		}else if (y == 0.0) {
			System.out.println("Eixo X");
		}else if(y > 0.0 || x > 0.0) {
			System.out.println("Q1");
		}else if(y > 0.0 || x < 0.0) {
			System.out.println("Q2");
		}else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
	}

}
