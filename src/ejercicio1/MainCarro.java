package ejercicio1;

public class MainCarro {
         static void main(){
        Carro c1 = new Carro(2,50);
        Carro c2 = new Carro(14,3);
        Carro c3 = new Carro(6,100);
        Carro c4 = new Carro(8,300);


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

