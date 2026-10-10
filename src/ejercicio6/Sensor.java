package ejercicio6;

public class Sensor {

        public String nombre;
        String tipo;
        public double lectura;


        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Tipo: " + tipo);
            System.out.println("Lectura: " + lectura);
        }


        void mostrarLectura() {
            System.out.println("Lectura actual: " + lectura);
        }
    }

