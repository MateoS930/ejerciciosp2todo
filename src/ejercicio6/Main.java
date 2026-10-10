package ejercicio6;

public class Main {
    public static void main(String[] args) {

        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();


        sensor1.nombre = "Sensor de Temperatura";
        sensor1.tipo = "Térmico";
        sensor1.lectura = 25.5;


        sensor2.nombre = "Sensor de Humedad";
        sensor2.tipo = "Higrómetro";
        sensor2.lectura = 60.0;

        System.out.println("--- Información Inicial ---");

        sensor1.mostrarInformacion();
        sensor1.mostrarLectura();

        System.out.println("---------------------------");


        sensor2.mostrarInformacion();
        sensor2.mostrarLectura();


        sensor1.lectura = 28.3;

        System.out.println("\n--- Después de modificar el sensor 1 ---");
        sensor1.mostrarInformacion();
        System.out.println("---------------------------");
        sensor2.mostrarInformacion();
    }
}
