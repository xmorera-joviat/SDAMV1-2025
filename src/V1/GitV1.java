package V1;

import java.util.Scanner;

public class GitV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int num = scanner.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " és: " + factorial);
        scanner.close();
    }
}

