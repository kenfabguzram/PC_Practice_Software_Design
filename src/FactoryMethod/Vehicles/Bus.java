package FactoryMethod.Vehicles;

import java.util.Date;

// Clase para autobuses
public class Bus implements Vehicle {
    private Date llegada;
    public Date getLlegada() {
        return llegada;
    }
    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }
    public Date getSalida() {
        return salida;
    }
    public void setSalida(Date salida) {
        this.salida = salida;
    }
    private Date salida;

    // Constructor para inicializar los atributos de llegada y salida
    public Bus(Date llegada, Date salida) {
        this.llegada = llegada;
        this.salida = salida;
    }
    public Bus() {
    }
    public void move() {
        System.out.println("El autobús está en movimiento.");
    }
}
