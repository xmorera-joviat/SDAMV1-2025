package ActRefaccio;

import java.util.Scanner;

class Operacio {
    private double num1;
    private double num2;
    private char operacio;

    public Operacio(double num1, double num2, char operacio) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacio = operacio;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getOperacio() {
        return operacio;
    }

    public void setOperacio(char operacio) {
        this.operacio = operacio;
    }
}

public class CalculadoraRefaccio {
    private static final String MISSATGE_INTRO_NUM1 = "Introdueix el primer número:";
    private static final String MISSATGE_INTRO_NUM2 = "Introdueix el segon número:";
    private static final String MISSATGE_OPERACIO = "Escull una operació: +, -, *, /";
    private static final String MISSATGE_ERROR_DIVISIÓ = "No es pot dividir per zero.";
    private static final String MISSATGE_ERROR_OPERACIO = "Operació no vàlida.";
    private static final String MISSATGE_RESULTAT = "El resultat és: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = llegirNumero(scanner, MISSATGE_INTRO_NUM1);
        double num2 = llegirNumero(scanner, MISSATGE_INTRO_NUM2);
        char operacio = llegirOperacio(scanner);

        Operacio op = new Operacio(num1, num2, operacio);
        double resultat = calcular(op);

        mostrarResultat(resultat);
        scanner.close();
    }

    private static double llegirNumero(Scanner scanner, String missatge) {
        System.out.println(missatge);
        return scanner.nextDouble();
    }

    private static char llegirOperacio(Scanner scanner) {
        System.out.println(MISSATGE_OPERACIO);
        return scanner.next().charAt(0);
    }

    private static double calcular(Operacio op) {
        switch (op.getOperacio()) {
            case '+': return op.getNum1() + op.getNum2();
            case '-': return op.getNum1() - op.getNum2();
            case '*': return op.getNum1() * op.getNum2();
            case '/': return (op.getNum2() != 0) ? op.getNum1() / op.getNum2() : mostrarErrorDivisio();
            default: 
                System.out.println(MISSATGE_ERROR_OPERACIO);
                return Double.NaN;
        }
    }

    private static double mostrarErrorDivisio() {
        System.out.println(MISSATGE_ERROR_DIVISIÓ);
        return Double.NaN;
    }

    private static void mostrarResultat(double resultat) {
        System.out.println(MISSATGE_RESULTAT + resultat);
    }
}
