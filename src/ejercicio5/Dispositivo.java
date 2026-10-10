package ejercicio5;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío o ser nulo");
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Por convención, los boolean usan "is" en lugar de "get"
    public boolean isActivo() {
        return activo;
    }

    // Corregido a camelCase para que coincida con el Main
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    public void activar() {
        // Mejor práctica: usar !activo en lugar de activo == false
        if (!activo) {
            activo = true;
            // Se agregó un espacio antes de "ha sido"
            System.out.println(nombre + " ha sido activado.");
        }
    }

    // Corregido a camelCase y se le agregó el modificador 'public'
    public void mostrarEstado() {
        String estado = activo ? "está activo" : "está inactivo";
        System.out.println(nombre + " " + estado);
    }
    public void desactivar() {
        if (activo) { // Si está activo actualmente
            activo = false; // Lo cambiamos a falso (inactivo)
            System.out.println(nombre + " ha sido desactivado.");
        } else {
            System.out.println(nombre + " ya se encuentra inactivo.");
        }
    }

}
