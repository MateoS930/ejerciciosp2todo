package ejercicio10;



public class Main {
    public static void main(String[] args) {

        SensorTemperatura sensor1 = new SensorTemperatura("SENS-SALA", 22.5, "Celsius");
        SensorTemperatura sensor2 = new SensorTemperatura("SENS-EXTERIOR", 14.0, "Celsius");

        System.out.println("=== LECTURAS INICIALES ===");
        sensor1.mostrarLectura();
        sensor2.mostrarLectura();

        System.out.println("\n=== ACTUALIZACIÓN DE TEMPERATURA ===");
        sensor1.setValorActual(24.8);
        sensor1.mostrarLectura();
    }
}
