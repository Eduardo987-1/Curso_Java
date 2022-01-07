package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo,pi= 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = (A * C)/2;
		circulo = C * C * pi;
		trapezio =  (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		System.out.println("TRIANGULO: " + triangulo);
		System.out.println("CIRCULO: " + circulo);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);

		
	}

}
