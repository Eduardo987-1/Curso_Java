package estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0;i < x;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				
				
			}
			
		}
		
	}

}
