package FactoryMethod.Factories;

import FactoryMethod.Vehicles.Vehicle;

// Clase abstracta para las factorías de vehículos
public abstract class VehicleFactory {
    // Método factory
    public abstract Vehicle createVehicle();
}