package FactoryMethod.Factories;

import java.util.Random;

import FactoryMethod.Vehicles.Bus;
import FactoryMethod.Vehicles.Minibus;
import FactoryMethod.Vehicles.Taxi;
import FactoryMethod.Vehicles.Vehicle;

// Implementación concreta de la factoría para vehículos que se eligen aleatoriamente en cada uso
public class RandomVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        Random random = new Random();
        // Se elige aleatoriamente entre autobuses, minibuses y taxis
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return new Bus();
            case 1:
                return new Minibus();
            default:
                return new Taxi();
        }
    }
}