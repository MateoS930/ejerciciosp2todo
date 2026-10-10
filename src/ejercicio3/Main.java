package ejercicio3;

public class Main {
    public static void main(String[] args) {

        // Crear los tres módulos
        Modulo modulo1 = new Modulo();
        Modulo modulo2 = new Modulo();
        Modulo modulo3 = new Modulo();


        // MÓDULO LOGIN
        modulo1.nombre = "Login";
        modulo1.lenguaje = "Java";
        modulo1.version = "1.0";
        modulo1.terminado = false;


        // MÓDULO INVENTARIO
        modulo2.nombre = "Inventario";
        modulo2.lenguaje = "Java";
        modulo2.version = "1.2";
        modulo2.terminado = false;


        // MÓDULO REPORTES
        modulo3.nombre = "Reportes";
        modulo3.lenguaje = "Java";
        modulo3.version = "2.0";
        modulo3.terminado = false;


        System.out.println("=== MÓDULO LOGIN ===");
        modulo1.mostrarInformacion();

        System.out.println("\n=== MÓDULO INVENTARIO ===");
        modulo2.mostrarInformacion();

        System.out.println("\n=== MÓDULO REPORTES ===");
        modulo3.mostrarInformacion();


        // Marcar solamente un módulo como terminado
        System.out.println("\n=== MARCANDO LOGIN COMO TERMINADO ===");

        modulo1.marcarTerminado();


        // Comprobar que los demás no cambian
        System.out.println("\n=== ESTADOS ===");

        System.out.print("Login: ");
        modulo1.mostrarEstado();

        System.out.print("Inventario: ");
        modulo2.mostrarEstado();

        System.out.print("Reportes: ");
        modulo3.mostrarEstado();


        // Mostrar versión de un módulo
        System.out.println("\n=== VERSIÓN ===");

        modulo2.mostrarVersion();
    }
}
