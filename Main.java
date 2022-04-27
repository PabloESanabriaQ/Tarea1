import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Modificar con un while para que el usuario pueda salir cuando quiera        
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de tareas");
        int numTareas = entrada.nextInt();
        entrada.nextLine();
        
        Tarea tareas[] = new Tarea[numTareas];
        
        for(int i = 0; i < tareas.length; i++){
            String nombre = "";
            String desc = "";
            System.out.println("Ingrese el nombre de la tarea");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la descripción de la tarea");
            desc = entrada.nextLine();    
            Tarea aux = new Tarea(i, nombre, desc);
            tareas[i] = aux;
            
        }
        entrada.close();
        for(int i = 0; i < tareas.length; i++){
            System.out.println(tareas[i].getAll());
        }
        
        
        
    }
}
