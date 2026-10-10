package ejercicio5;

public class Main {
    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();


        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.activar();


        dispositivo2.setNombre("Impresora");
        dispositivo2.setTipo("Periferico");
        dispositivo2.activar();

        System.out.println("\n--- Información Inicial ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();
        System.out.println("---------------------------------------");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();



        System.out.println("\n--- Modificando el Dispositivo 2 ---");

        dispositivo2.setNombre("Impresora 3D");
        dispositivo2.desactivar();

        System.out.println("\n--- Información del Dispositivo 2 Actualizada ---");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();
    }
}
