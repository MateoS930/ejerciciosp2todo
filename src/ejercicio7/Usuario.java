package ejercicio7;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    public void setContrasena(String contrasena) {
        if(contrasena.length() >= 8 && contrasena.length() <=16) {
            this.contrasena = contrasena;
        }else{
            System.out.println("Esta mal la contraseña");
        }
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreUsuario() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void mostrarDatos() {
        System.out.println("Nombre de usuario: " + this.nombre);
        System.out.println("Correo electrónico: " + this.correo);
    }


}
