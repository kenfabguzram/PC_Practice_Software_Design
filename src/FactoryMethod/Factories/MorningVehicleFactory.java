package FactoryMethod.Factories;

import java.util.Random;

import FactoryMethod.Vehicles.Bus;
import FactoryMethod.Vehicles.Minibus;
import FactoryMethod.Vehicles.Taxi;
import FactoryMethod.Vehicles.Vehicle;

// Implementación concreta de la factoría para vehículos que se usan en la mañana
public class MorningVehicleFactory extends VehicleFactory {
    private int[] listaPosibilidades={0,0,1,1,2};
    @Override
    public Vehicle createVehicle() {
        Random random = new Random();
        int choice = random.nextInt(5);
        //Por precio las personas suelen escoger más buses y minibuses en las mañanas
        switch (listaPosibilidades[choice]) {
            case 0:
                return new Bus();
            case 1:
                return new Minibus();
            default:
                return new Taxi();
        }

    }
}