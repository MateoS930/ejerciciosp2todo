package dispositivo;

public class main {
    public static void main(String[] args){
        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo1.nombre= "celular";
        dispositivo1.tipo="electrodomestico";
        dispositivo1.activo=false;
        dispositivo2.nombre="Laptop";
        dispositivo2.tipo="Tecnologia";
        dispositivo2.activo=false;
        dispositivo1.mostrarinformacion();
        dispositivo2.mostrarinformacion();
        dispositivo1.mostrarestado();
        dispositivo2.mostrarestado();
    }


}
