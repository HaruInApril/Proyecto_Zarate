package Unopuntocero;
public class Registros{
    private String[] datos;
    public Registros(String hola){
        this.datos= hola.split(",");
    }
    public String getAvion(){
        return datos[0];
    }
    public String getRuta(){
        return datos[1];
    }
    public String getHoraSal(){
        return datos[2];
    }
    public String getHoraLle(){
        return datos[3];
    }
    public String toString(){
        return datos[0]+"   "+datos[1]+"\t"+datos[2]+"   "+datos[3];
    }
    
}