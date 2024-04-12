package FactoryMethod.Factories;


import FactoryMethod.Vehicles.Bus;
import FactoryMethod.Vehicles.Minibus;
import FactoryMethod.Vehicles.Taxi;
import FactoryMethod.Vehicles.Vehicle;

// Implementación concreta de la factoría para vehículos que se usan en cualquier momento del día
public class EqualVehicleFactory extends VehicleFactory {
    private static int nextVehicleType = 0;

    @Override
    public Vehicle createVehicle() {
        // Se eligen los autobuses, minibuses y taxis de manera secuencial y justa
        switch (nextVehicleType) {
            case 0:
                nextVehicleType=(nextVehicleType+1)%3;
                return new Bus();
            case 1:
                nextVehicleType=(nextVehicleType+1)%3;
                return new Minibus();
            default:
                nextVehicleType=(nextVehicleType+1)%3;
                return new Taxi();
        }
    }
}
