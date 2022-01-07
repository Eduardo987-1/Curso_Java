package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numfunc,horastrab;
		Double salario,resultado;
		numfunc = sc.nextInt();
		horastrab = sc.nextInt();
		salario = sc.nextDouble();
		resultado = horastrab * salario;
		System.out.println("Number: " + numfunc);
		System.out.println("Salary:  " + resultado );

	}

}
