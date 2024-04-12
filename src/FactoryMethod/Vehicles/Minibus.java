package FactoryMethod.Vehicles;

import java.util.Date;

// Clase para minibuses
public class Minibus implements Vehicle {
    

    private Date llegada;

    private Date salida;
    
    // Constructor para inicializar los atributos de llegada y salida
    
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
    public Minibus(Date llegada, Date salida) {
        this.llegada = llegada;
        this.salida = salida;
    }
    public Minibus() {
    }
    @Override
    public void move() {
        System.out.println("El minibús está en movimiento.");
    }
}
