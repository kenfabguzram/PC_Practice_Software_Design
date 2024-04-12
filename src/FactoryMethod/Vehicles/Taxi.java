package FactoryMethod.Vehicles;

import java.util.Date;

// Clase para taxis
public class Taxi implements Vehicle {

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
    public Taxi(Date llegada, Date salida) {
        this.llegada = llegada;
        this.salida = salida;
    }
    public Taxi() {
    }
    @Override
    public void move() {
        System.out.println("El taxi está en movimiento.");
    }
}
