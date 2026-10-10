package ejercicio2;

public class Tarea {
    // Atributos public
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;


    public void mostrarInformacion() {

        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);

        if (completada) {
            System.out.println("Estado: Completada");
        } else {
            System.out.println("Estado: Pendiente");
        }
    }


    public void completar() {

        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Error: la tarea debe tener un título.");
        }

        else if (responsable == null || responsable.isEmpty()) {
            System.out.println("Error: la tarea debe tener un responsable.");
        }

        else if (horasEstimadas <= 0) {
            System.out.println("Error: las horas estimadas deben ser mayores que 0.");
        }

        else if (completada) {
            System.out.println("La tarea ya se encuentra completada.");
        }

        else {
            completada = true;
            System.out.println("La tarea " + titulo + " fue completada correctamente.");
        }
    }


    void mostrarResponsable() {

        if (responsable == null || responsable.isEmpty()) {
            System.out.println("No existe un responsable registrado.");
        } else {
            System.out.println("Responsable: " + responsable);
        }
    }


    void mostrarEstado() {

        if (completada) {
            System.out.println("Estado: Completada");
        } else {
            System.out.println("Estado: Pendiente");
        }
    }
}
