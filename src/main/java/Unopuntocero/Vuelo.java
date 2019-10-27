package Unopuntocero;

import java.time.Instant;
import java.util.Date;

public class Vuelo{
    private avion vehiculo;
    private ruta seguimiento;
    private java.util.Date fecha;

    public Vuelo(avion vehiculo, ruta seguimiento) {
        this.vehiculo = vehiculo;
        this.seguimiento = seguimiento;
        this.vehiculo.setEstado(1);
        this.seguimiento.setEstado(1);
        fecha= new Date();
    }

    public avion getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(avion vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ruta getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(ruta seguimiento) {
        this.seguimiento = seguimiento;
    }

    public String getFecha() {
        return fecha.getTime()+"";
    }
    
    public void liberar_vuelo(){
       this.vehiculo.setEstado(0);
       this.seguimiento.setEstado(0);
       this.vehiculo= null;
       this.seguimiento= null;
       this.fecha=null;
    }
    public void agendar_vuelo(avion vehiculo, ruta seguimiento){
       this.vehiculo = vehiculo;
        this.seguimiento = seguimiento;
        this.vehiculo.setEstado(1);
        this.seguimiento.setEstado(1);
        fecha= new Date();
    }
    public String toString(){
        return this.getVehiculo()+","+this.seguimiento+","+this.getFecha()+","+Date.from(Instant.MIN).getTime();
    }
    
    
    
           
}