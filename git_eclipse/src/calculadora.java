import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = s.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = s.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = s.next().charAt(0);
        
        double resultado = 0;
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }
}