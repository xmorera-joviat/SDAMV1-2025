import java.util.ArrayList;
import java.util.Scanner;

public class GestionTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        
        while (true) {
            System.out.println("\nGestión de Tareas:");
            System.out.println("1. Agregar tarea\n2. Ver tareas\n3. Eliminar tarea\n4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    String tarea = scanner.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    System.out.println("Lista de tareas:");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número de la tarea a eliminar: ");
                    int indice = scanner.nextInt() - 1;
                    if (indice >= 0 && indice < tareas.size()) {
                        tareas.remove(indice);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}