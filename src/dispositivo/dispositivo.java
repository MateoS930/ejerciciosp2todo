package dispositivo;

class dispositivo {
    String tipo;
    public boolean activo;

    static class detalleNombre {
        public String primero;
        public String segundo;
    }

    public detalleNombre nombre = new detalleNombre();

    public void asignardatos() {
        nombre.primero = "Mateo";
        nombre.segundo = "Salgado";

    }

    public void mostrarinformacion() {
        System.out.println("El primer nombre es " + nombre.primero + " y el segundo nombre es " + nombre.segundo);
    }



}


