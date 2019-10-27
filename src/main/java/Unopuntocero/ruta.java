package Unopuntocero;
public class ruta{
    //atributos
    private String ruta;
    private int estado;
    //Constructores
    public ruta(){
        this.ruta="";
        this.estado=0;
    }
    public ruta(String ruta, int estado){
        this.ruta=ruta;
        this.estado=estado;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String toString(){
        return this.ruta+" "+this.estado;
    }
    
}