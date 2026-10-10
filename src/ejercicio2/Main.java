package ejercicio2;

public class Main {
    public static void main(String[] args) {

        // Crear las tres tareas
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();


        // TAREA 1
        tarea1.titulo = "Crear pantalla de login";
        tarea1.responsable = "José";
        tarea1.horasEstimadas = 3;
        tarea1.completada = false;


        // TAREA 2
        tarea2.titulo = "Diseñar base de datos";
        tarea2.responsable = "Carlos";
        tarea2.horasEstimadas = 5;
        tarea2.completada = false;


        // TAREA 3
        tarea3.titulo = "Generar reportes";
        tarea3.responsable = "Ana";
        tarea3.horasEstimadas = 4;
        tarea3.completada = false;


        System.out.println("=== TAREA 1 ===");
        tarea1.mostrarInformacion();

        System.out.println("\n=== TAREA 2 ===");
        tarea2.mostrarInformacion();

        System.out.println("\n=== TAREA 3 ===");
        tarea3.mostrarInformacion();


        // Completar solamente una tarea
        System.out.println("\n=== COMPLETANDO TAREA 1 ===");

        tarea1.completar();


        // Comprobar los estados
        System.out.println("\n=== ESTADOS ===");

        System.out.print("Tarea 1: ");
        tarea1.mostrarEstado();

        System.out.print("Tarea 2: ");
        tarea2.mostrarEstado();

        System.out.print("Tarea 3: ");
        tarea3.mostrarEstado();


        // Mostrar responsable
        System.out.println("\n=== RESPONSABLE ===");

        tarea2.mostrarResponsable();
    }
}
