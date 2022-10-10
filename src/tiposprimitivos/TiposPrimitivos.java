package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// System.out.print("A sua nota é " + nota);
		
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			String nome = teclado.nextLine();
			System.out.print("Digite sua nota: ");
			float nota = teclado.nextFloat();
			System.out.printf("A nota de %s é %.1f \n", nome, nota);
	}

}
