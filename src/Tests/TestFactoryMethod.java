package Tests;
import FactoryMethod.Factories.*;
import FactoryMethod.Vehicles.*;
public class TestFactoryMethod {
    public static void main(String[] args) throws Exception {
        VehicleFactory[] factories={new EqualVehicleFactory(),
                                    new MorningVehicleFactory(),
                                    new NightVehicleFactory(),
                                    new RandomVehicleFactory()};
        int[] valuesPer100={0,0,0};
        Vehicle testVehicle;
        for (int i = 0; i < factories.length; i++) {
            for (int j = 0; j < 100; j++) {
                testVehicle=factories[i].createVehicle();
                if(testVehicle instanceof Taxi){
                    valuesPer100[0]++;
                }
                if(testVehicle instanceof Minibus){
                    valuesPer100[1]++;
                }
                if(testVehicle instanceof Bus){
                    valuesPer100[2]++;
                }
            }
            // Print test results
            System.out.println("Test Results of " + factories[i].getClass() + ":");
            System.out.println("Taxis created per 100 vehicles: " + valuesPer100[0]);
            System.out.println("Minibuses created per 100 vehicles: " + valuesPer100[1]);
            System.out.println("Buses created per 100 vehicles: " + valuesPer100[2]);
            valuesPer100[0]=0;
            valuesPer100[1]=0;
            valuesPer100[2]=0;
        }

        
    }
}
