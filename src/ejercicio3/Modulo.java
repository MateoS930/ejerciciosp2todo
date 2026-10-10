package ejercicio3;

public class Modulo {
    // Atributos public
    public String nombre;
    public String lenguaje;

    // Atributos con acceso por defecto
    String version;
    boolean terminado;


    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);

        if (terminado) {
            System.out.println("Estado: Terminado");
        } else {
            System.out.println("Estado: En desarrollo");
        }
    }


    public void marcarTerminado() {

        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: el módulo debe tener un nombre.");
        }

        else if (lenguaje == null || lenguaje.isEmpty()) {
            System.out.println("Error: el módulo debe tener un lenguaje.");
        }

        else if (version == null || version.isEmpty()) {
            System.out.println("Error: el módulo debe tener una versión.");
        }

        else if (terminado) {
            System.out.println("El módulo ya se encuentra terminado.");
        }

        else {
            terminado = true;
            System.out.println("El módulo " + nombre + " fue marcado como terminado.");
        }
    }


    void mostrarEstado() {

        if (terminado) {
            System.out.println("El módulo está terminado.");
        } else {
            System.out.println("El módulo está en desarrollo.");
        }
    }


    void mostrarVersion() {

        if (version == null || version.isEmpty()) {
            System.out.println("No existe una versión registrada.");
        } else {
            System.out.println("Versión: " + version);
        }
    }
}
