public class Puerta {
    boolean abierta= false;

    public void abrir(){
        this.abierta= true;
    }

    public void cerrar(){
        this.abierta= false;
    }

    public void estado(){
        if (abierta) {
            System.out.println("La puerta está abierta");
        }else{
            System.out.println("La puerta está cerrada");
        }
    }
    public static void main(String[] args) throws Exception{
        Puerta puerta= new Puerta();

        puerta.estado();
        puerta.abrir();
        puerta.estado();
        puerta.cerrar();
        puerta.estado();    
    }
}
