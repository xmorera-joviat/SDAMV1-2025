package V1;

import java.util.Random;
import java.util.Scanner;

public class GitV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecret = random.nextInt(100) + 1;
        int intent;
        
        System.out.println("Benvingut al joc! Intenta endevinar el número (entre 1 i 100).");
        
        do {
            System.out.print("Introdueix la teva endevinalla: ");
            intent = scanner.nextInt();
            
            if (intent < numeroSecret) {
                System.out.println("Més alt!");
            } else if (intent > numeroSecret) {
                System.out.println("Més baix!");
            } else {
                System.out.println("Felicitats! Has endevinat el número.");
            }
        } while (intent != numeroSecret);
        
        scanner.close();
    }
}

