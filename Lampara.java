public class Lampara {
    public boolean encendida= false;
    
    public void encender(){
        this.encendida=true;
    }

    public void apagar(){
        this.encendida= false;
    }

    public String estado(){
        if(this.encendida){
            return "La lámpara está encendida";
        }else{
            return "Lampara apagada";
        }

    }

     public static void main(String[] args) throws Exception{ 
        Lampara lampara= new Lampara();
        System.out.println(lampara.estado());   
        lampara.encender();
        System.out.println(lampara.estado());
        lampara.apagar();
        System.out.println(lampara.estado());
    }   
}
