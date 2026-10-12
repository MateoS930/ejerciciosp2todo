package ejercicio8;

public class RegistroIP {

    private String direccionIP;
    private String horaAcceso;
    private boolean permitida;


    public RegistroIP(String direccionIP, String horaAcceso, boolean permitida) {
        this.direccionIP = direccionIP;
        this.horaAcceso = horaAcceso;
        this.permitida = permitida;
    }

    // 3. Métodos GET
    public String getDireccionIP() {
        return direccionIP;
    }

    public String getHoraAcceso() {
        return horaAcceso;
    }

    public boolean isPermitida() {
        return permitida;
    }

    // 4. Métodos SET
    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public void setHoraAcceso(String horaAcceso) {
        this.horaAcceso = horaAcceso;
    }

    public void setPermitida(boolean permitida) {
        this.permitida = permitida;
    }


    public void mostrarEstado() {
        System.out.println("Dirección IP: " + this.direccionIP);
        System.out.println("Hora de acceso: " + this.horaAcceso);

        if (this.permitida == true) {
            System.out.println("Estado: Acceso PERMITIDO\n");
        } else {
            System.out.println("Estado: Acceso DENEGADO\n");
        }
    }
}

