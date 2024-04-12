package FactoryMethod.Factories;

import java.util.Random;

import FactoryMethod.Vehicles.Minibus;
import FactoryMethod.Vehicles.Taxi;
import FactoryMethod.Vehicles.Vehicle;

// Implementación concreta de la factoría para vehículos que se usan en la noche
public class NightVehicleFactory extends VehicleFactory {
    private boolean[] listaPosibilidades={true,false,false};
    @Override
    public Vehicle createVehicle() {
        Random random = new Random();
        return listaPosibilidades[random.nextInt(3)]?new Minibus():new Taxi();
        //A altas horas de la noche los buses dejan de salir y en este caso por la baja 
        //demanda se da el doble de posibilidades a los taxis que a las microbuses
        //Por seguridad las personas suelen optar por transporte en Taxi en las noches
    }
}