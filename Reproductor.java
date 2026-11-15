public class Reproductor {

    String cancion= "";
    Boolean reproduciendo= false;
    
    public void reproducir(String cancion){
        this.cancion=cancion;
        this.reproduciendo= true;
    }

    public void pausar(){
        this.reproduciendo= false;
    }

    public void estado(){
        if(this.reproduciendo){
            System.out.println("Se está reproduciendo la canción: "+ this.cancion);
        }else{
            System.out.println("Canción está en pausa");
        }
    }
    public static void main(String[] args) {
        Reproductor reproductor= new Reproductor();
        reproductor.estado();
        reproductor.reproducir("Si en tu mente estuve");
        reproductor.estado();
        reproductor.pausar();
        reproductor.estado();
    }
}
