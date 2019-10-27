package Unopuntocero;
public class Registros{
    private String[] datos;
    public Registros(String hola){
        this.datos= hola.split(",");
    }
    public String toString(){
        return datos[0]+"   "+datos[1]+"\t"+datos[2]+"   "+datos[3];
    }
    
}