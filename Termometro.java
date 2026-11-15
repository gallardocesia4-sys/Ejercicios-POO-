public class Termometro {
    double temperatura = 0.0; 

    public void subir(double grados) {
        this.temperatura += grados; 
    }

    public void bajar(double grados) {
        this.temperatura -= grados;
    }

    public void mostrarTemperatura() {
        System.out.println("La temperatura actual es: " + this.temperatura + " °C");
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        
        termometro.mostrarTemperatura();
        termometro.subir(25.5);
        termometro.mostrarTemperatura();
        termometro.bajar(5.0);
        termometro.mostrarTemperatura();
    }
}