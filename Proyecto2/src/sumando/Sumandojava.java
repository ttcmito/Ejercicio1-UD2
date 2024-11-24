package sumando;

import java.util.Scanner;

public class Sumandojava {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce un dato: ");
		int datos = entrada.nextInt();
		System.out.print("Introduce otro dato: ");
		int datos1 = entrada.nextInt();
		
		System.out.println("La suma es: " + (datos + datos1));
		entrada.close();
	}

}
