package ejercicio8;


public class Main {
    public static void main(String[] args) {

        RegistroIP ip1 = new RegistroIP("192.168.1.15", "08:30", true);

        RegistroIP ip2 = new RegistroIP("10.0.0.42", "14:45", false);

        System.out.println("--- Registro 1 ---");
        ip1.mostrarEstado();

        System.out.println("--- Registro 2 ---");
        ip2.mostrarEstado();
    }
}