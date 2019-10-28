package Unopuntocero;

import java.util.Arrays;

public class Aeropuertos{
    private avion[] aviones;
    private ruta[] rutas;
    private  Vuelo[] vuelos;
    private Registros[] registro;

    public Aeropuertos() {
        this.aviones=new avion[0];
        this.rutas=new ruta[0];
        this.vuelos=new Vuelo[0];
        this.registro=new Registros[0];
    }

    
    public Aeropuertos(avion[] aviones, ruta[] rutas, Vuelo[] vuelos) {
        this.aviones = aviones;
        this.rutas = rutas;
        this.vuelos = vuelos;
        this.registro = new Registros[0];
    }

    public avion[] getAviones() {
        return aviones;
    }

    public void setAviones(avion[] aviones) {
        this.aviones = aviones;
    }

    public ruta[] getRutas() {
        return rutas;
    }

    public void setRutas(ruta[] rutas) {
        this.rutas = rutas;
    }

    public Vuelo[] getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    public Registros[] getRegistro() {
        return registro;
    }

    public void setRegistro(Registros[] registro) {
        this.registro = registro;
    }
    
    public void addAvion(avion obj){
        avion aux[]=this.getAviones();
        this.aviones=Arrays.copyOf(aux, aux.length+1);
        this.aviones[aviones.length-1]=obj;
    }
    
    public void addRuta(ruta obj){
        ruta aux[]=this.rutas;
        this.rutas=Arrays.copyOf(aux, aux.length+1);
        this.rutas[aviones.length-1]=obj;
    }
    public void addVuelo(Vuelo obj){
        Vuelo aux[]=this.vuelos;
        this.vuelos=Arrays.copyOf(aux, aux.length+1);
        this.vuelos[vuelos.length]=obj;
    }
    public void addRegistro(Registros obj){
        Registros aux[]=this.registro;
        registro= new Registros[aux.length+1];
        for(int i=0;i<aux.length;i++){
            registro[i]=aux[i];
        }
        this.registro[registro.length-1]=obj;
    }
}