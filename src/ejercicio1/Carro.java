package ejercicio1;

public class Carro {
        private int potencia;
        private double velocidad;
        public void setPotencia(int potencia){
            this.potencia = potencia;

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

