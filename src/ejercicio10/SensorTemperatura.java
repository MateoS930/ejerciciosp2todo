package ejercicio10;


public class SensorTemperatura {

    private String idSensor;
    private double valorActual;
    private String unidad;


    public SensorTemperatura(String idSensor, double valorActual, String unidad) {
        this.idSensor = idSensor;
        this.valorActual = valorActual;
        this.unidad = unidad;
    }


    public double getValorActual() {
        return valorActual;
    }

    public String getUnidad() {
        return unidad;
    }


    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }


    public void mostrarLectura() {
        System.out.println("Sensor [" + this.idSensor + "] - Lectura actual: " + this.valorActual + "° " + this.unidad);
    }
}
