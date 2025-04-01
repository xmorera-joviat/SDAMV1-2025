package ActRefaccio;
import java.util.Scanner;

public class CalculadoraOriginal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix el primer número:");
		double num1 = scanner.nextDouble();
		System.out.println("Introdueix el segon número:");
		double num2 = scanner.nextDouble();
		System.out.println("Escull una operació: +, -, *, /");
		char operacio = scanner.next().charAt(0);

		double resultat = 0;
		if (operacio == '+') {
			resultat = num1 + num2;
		} else if (operacio == '-') {
			resultat = num1 - num2;
		} else if (operacio == '*') {
			resultat = num1 * num2;
		} else if (operacio == '/') {
			if (num2 != 0) {
				resultat = num1 / num2;
			} else {
				System.out.println("No es pot dividir per zero.");
				scanner.close();
				return;
			}
		} else {
			System.out.println("Operació no vàlida.");
			scanner.close();
			return;
		}

		System.out.println("El resultat és: " + resultat);
		scanner.close();
	}
}