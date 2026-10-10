package ejercicio4;

public class Main {
    public static void main(String[] args) {

        // Crear los tres objetos
        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego();
        Videojuego videojuego3 = new Videojuego();


        // VIDEOJUEGO 1
        videojuego1.nombre = "Minecraft";
        videojuego1.genero = "Supervivencia";
        videojuego1.version = "1.21";
        videojuego1.activo = false;


        // VIDEOJUEGO 2
        videojuego2.nombre = "Valorant";
        videojuego2.genero = "Shooter";
        videojuego2.version = "10.0";
        videojuego2.activo = false;


        // VIDEOJUEGO 3
        videojuego3.nombre = "Rocket League";
        videojuego3.genero = "Deportes";
        videojuego3.version = "2.45";
        videojuego3.activo = false;


        System.out.println("=== INFORMACIÓN INICIAL ===");

        videojuego1.mostrarInformacion();
        System.out.println();

        videojuego2.mostrarInformacion();
        System.out.println();

        videojuego3.mostrarInformacion();


        System.out.println("\n=== INICIANDO VIDEOJUEGO 1 ===");

        videojuego1.iniciar();


        System.out.println("\n=== ESTADOS DESPUÉS DEL CAMBIO ===");

        videojuego1.mostrarInformacion();
        System.out.println();

        videojuego2.mostrarInformacion();
        System.out.println();

        videojuego3.mostrarInformacion();


        System.out.println("\n=== MOSTRAR VERSIÓN ===");

        videojuego1.mostrarVersion();


        System.out.println("\n=== CERRANDO VIDEOJUEGO 1 ===");

        videojuego1.cerrar();


        System.out.println("\n=== ESTADO FINAL ===");

        videojuego1.mostrarInformacion();
    }
}
