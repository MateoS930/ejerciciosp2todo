package ejercicio9;



public class LuzInteligente {

    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;


    public LuzInteligente(String idLuz) {
        this.idLuz = idLuz;
        this.nivelBrillo = 0;      // Nace con 0% de brillo
        this.encendida = false;    // Nace apagada
    }


    public void encender() {
        this.encendida = true;
        System.out.println(this.idLuz + " ha sido ENCENDIDA.");
    }

    public void apagar() {
        this.encendida = false;
        this.nivelBrillo = 0; // Por lógica, si se apaga, el brillo baja a 0
        System.out.println(this.idLuz + " ha sido APAGADA.");
    }


    public void ajustarBrillo(int nuevoNivel) {
        // Primera regla: ¿Está encendida?
        if (this.encendida == true) {
            // Segunda regla: ¿El nivel está entre 0 y 100?
            if (nuevoNivel >= 0 && nuevoNivel <= 100) {
                this.nivelBrillo = nuevoNivel;
                System.out.println("Brillo de " + this.idLuz + " ajustado a: " + this.nivelBrillo + "%");
            } else {
                System.out.println("Error: El brillo debe estar entre 0 y 100.");
            }
        } else {
            System.out.println("Error: No se puede ajustar el brillo. " + this.idLuz + " está apagada.");
        }
    }


    public void mostrarEstado() {
        System.out.println("--- Estado de " + this.idLuz + " ---");
        if (this.encendida) {
            System.out.println("Estado: Encendida");
        } else {
            System.out.println("Estado: Apagada");
        }
        System.out.println("Nivel de brillo: " + this.nivelBrillo + "%\n");
    }
}
