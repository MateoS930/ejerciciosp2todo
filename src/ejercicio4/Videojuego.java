package ejercicio4;

public class Videojuego {
    // Atributos public
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto
    String version;
    boolean activo;


    public void mostrarInformacion() {

        System.out.println("----- VIDEOJUEGO -----");

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre: No registrado");
        } else {
            System.out.println("Nombre: " + nombre);
        }

        if (genero == null || genero.trim().isEmpty()) {
            System.out.println("Género: No registrado");
        } else {
            System.out.println("Género: " + genero);
        }

        if (version == null || version.trim().isEmpty()) {
            System.out.println("Versión: No registrada");
        } else {
            System.out.println("Versión: " + version);
        }

        if (activo) {
            System.out.println("Estado: Activo");
        } else {
            System.out.println("Estado: Inactivo");
        }
    }


    public void iniciar() {

        // Validamos que los datos principales existan
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: el videojuego no tiene un nombre válido.");
            return;
        }

        if (genero == null || genero.trim().isEmpty()) {
            System.out.println("Error: el videojuego no tiene un género válido.");
            return;
        }

        if (version == null || version.trim().isEmpty()) {
            System.out.println("Error: el videojuego no tiene una versión válida.");
            return;
        }

        if (activo) {
            System.out.println(nombre + " ya se encuentra activo.");
        } else {
            activo = true;
            System.out.println(nombre + " ha sido iniciado.");
        }
    }


    void cerrar() {

        if (!activo) {
            System.out.println(nombre + " ya se encuentra cerrado.");
        } else {
            activo = false;
            System.out.println(nombre + " ha sido cerrado.");
        }
    }


    void mostrarVersion() {

        if (version == null || version.trim().isEmpty()) {
            System.out.println("La versión no ha sido registrada.");
        } else {
            System.out.println("Versión: " + version);
        }
    }
}
