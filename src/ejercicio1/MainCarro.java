package ejercicio1;

public class MainCarro {
        static void main(){
            Carro c1 = new Carro();
            Carro c2 = new Carro();
            Carro c3 = new Carro();
            Carro c4 = new Carro();
            c1.setPotencia(2);
            c1.setVelocidad(50);
            c2.setPotencia(3);
            c2.setVelocidad(0);
            c3.setPotencia(6);
            c3.setVelocidad(100);
            c4.setPotencia(8);
            c4.setVelocidad(300);


            System.out.println("La velocidad del carro 1 es: "+c1.getVelocidad()+" y la potencia es: "+c1.getPotencia());
            System.out.println("La velocidad del carro 2 es: "+c2.getVelocidad()+" y la potencia es: "+c2.getPotencia());
            System.out.println("La velocidad del carro 3 es: "+c3.getVelocidad()+" y la potencia es: "+c3.getPotencia());
            System.out.println("La velocidad del carro 4 es: "+c4.getVelocidad()+" y la potencia es: "+c4.getPotencia());
            c1.acelerar();
            c1.acelerar();
            c1.frenar();
            c2.acelerar();
            c2.acelerar();
            c2.frenar();
            c3.acelerar();
            c3.acelerar();
            c3.frenar();
            c4.acelerar();
            c4.acelerar();
            c4.frenar();
            System.out.println("La velocidad del carro 1 es: "+c1.getVelocidad()+" y la potencia es: "+c1.getPotencia());
            System.out.println("La velocidad del carro 2 es: "+c2.getVelocidad()+" y la potencia es: "+c2.getPotencia());
            System.out.println("La velocidad del carro 3 es: "+c3.getVelocidad()+" y la potencia es: "+c3.getPotencia());
            System.out.println("La velocidad del carro 4 es: "+c4.getVelocidad()+" y la potencia es: "+c4.getPotencia());

        }

    }

