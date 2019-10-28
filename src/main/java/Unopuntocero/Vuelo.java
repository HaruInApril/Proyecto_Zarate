package Unopuntocero;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Vuelo{
    private avion vehiculo;
    private ruta seguimiento;
    private String fecha;
    private int estado;

    public Vuelo() {
        this.estado=0;
        this.vehiculo=null;
        this.seguimiento=null;
        this.fecha=null;
        this.estado=0;
    }

    public Vuelo(avion vehiculo, ruta seguimiento) {
        this.vehiculo = vehiculo;
        this.seguimiento = seguimiento;
        this.vehiculo.setEstado(1);
        this.seguimiento.setEstado(1);
        this.estado=1;
        this.fecha= Calendar.HOUR+":"+Calendar.MINUTE+":"+Calendar.SECOND;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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
        return fecha;
    }
    
    public void liberar_vuelo(){
        this.estado=0;
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
        Calendar calendario = Calendar.getInstance();
        fecha= calendario.get(Calendar.HOUR)+":"+calendario.get(Calendar.MINUTE)+":"+calendario.get(Calendar.SECOND);
       this.estado=1;
    }
    public String toString(){
        Calendar ahora = Calendar.getInstance();
        return this.getVehiculo().getModelo()+","+this.seguimiento.getRuta()+","+this.getFecha()+","+ahora.get(Calendar.HOUR)+":"+ahora.get(Calendar.MINUTE)+":"+ahora.get(Calendar.SECOND);
    }
    
    
    
           
}