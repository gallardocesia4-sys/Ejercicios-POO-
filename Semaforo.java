public class Semaforo {
    String color= "rojo";

    public void cambiarRojo(){
        this.color= "rojo";
    }

    public void cambiarAmarillo(){
        this.color= "amarillo";
    }

    public void cambiarVerde(){
        this.color= "verde";
    }

    public void mostrarColor(){
        System.out.println("El semáforo esta en color " + this.color);
    }
     public static void main(String[] args) throws Exception{
        Semaforo semaforo= new Semaforo();
        semaforo.mostrarColor(); 
        semaforo.cambiarAmarillo();
        semaforo.mostrarColor();
        semaforo.cambiarRojo();
        semaforo.mostrarColor();
        semaforo.cambiarVerde();
        semaforo.mostrarColor();
     }
}
