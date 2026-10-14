package ejercicio1;

 private int potencia;
    private double velocidad;



    private static int numCarros = 0;
    //Constante de clase
    private static final double IVA= 0.15;


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
        numCarros++;
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
    public static int getNumCarros(){
        return numCarros;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public static double getIva(){
        return IVA;
    }
public double calcularPrecioVenta(double precio){
        return precio +(precio+IVA);
}
    public void acelerar(){velocidad+=potencia;}
    void frenar(){velocidad/=2;}
}

