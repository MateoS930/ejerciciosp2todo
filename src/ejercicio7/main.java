package ejercicio7;

public class main {
    public static void main(String[] args) {


        Usuario usuario1 = new Usuario();


        usuario1.setNombre("Zenith243");
        usuario1.setCorreo("zenith343@gmail.com");


        System.out.println("--- Prueba con contraseña corta ---");
        usuario1.setContrasena("187565");

        System.out.println("\n--- Prueba con contraseña correcta ---");
        usuario1.setContrasena("Spider_Dark283");


        System.out.println("\n--- Datos guardados ---");
        usuario1.mostrarDatos();

}}
