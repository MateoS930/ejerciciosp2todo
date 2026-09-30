package dispositivo;

public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;
    public void mostrarinformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("tipo: "+tipo);
        System.out.println("Activo: "+activo);
    }
    public void activar(){
        if (activo==false){
            activo=true;
            System.out.println(nombre + "ha sido activado.");

        }
    }
    void mostrarestado(){
        String estado = activo?"esta activo":"esta inactivo";
        System.out.println(nombre + " "+estado);
    }


}



