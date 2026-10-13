package ejercicio1;

public class Carro {
    private int potencia;
    private double velocidad;
    public void setPotencia(int potencia){
        if (potencia <= 0) {
            this.potencia = 1;
        } else {
            this.potencia = potencia;
        }

    }
    public Carro(int potencia, double velocidad){
        /*this.velocidad = velocidad;
        this.potencia = potencia;
        si mis datos necesitan validacion llamo a los set*/
        setPotencia(potencia);
        setVelocidad(velocidad);
    }

    public void setVelocidad(double velocidad) {
        if (velocidad <= 0) {
            this.velocidad = 1.0;
        } else {
            this.velocidad = velocidad;
        }
    }
    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(){velocidad+=potencia;}
    void frenar(){velocidad/=2;}
}

