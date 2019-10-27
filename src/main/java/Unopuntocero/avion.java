package Unopuntocero;
public class avion{
    private String modelo;
    private int estado;

    public avion() {
    }

    public avion(String modelo, int estado) {
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}