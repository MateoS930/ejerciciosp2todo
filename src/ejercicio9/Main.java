package ejercicio9;


public class Main {
    public static void main(String[] args) {

        LuzInteligente luz1 = new LuzInteligente("LuzSala");
        LuzInteligente luz2 = new LuzInteligente("LuzDormitorio");

        System.out.println("=== PRUEBA LUZ 1 (ENCENDIDA) ===");
        luz1.encender();
        luz1.ajustarBrillo(75);
        luz1.mostrarEstado();

        System.out.println("=== PRUEBA LUZ 2 (APAGADA) ===");

        luz2.ajustarBrillo(50);
        luz2.mostrarEstado();

        System.out.println("=== PRUEBA DE LÍMITES ===");
        luz1.ajustarBrillo(150);
    }
}
