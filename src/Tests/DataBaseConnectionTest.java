package Tests;


import Singleton.DataBaseConnection;

public class DataBaseConnectionTest {
    
    public static void main(String[] args) {
        //Nunca se está más de un objeto. 
        //connection1 es una instancia de DataBaseConnection que si tiene un objeto.
        //connection2 es la misma instancia de connection1.
        DataBaseConnection connection1 = DataBaseConnection.getInstance();
        DataBaseConnection connection2 = DataBaseConnection.getInstance();
        
        //Para comprobar que son la misma instancia, se pueden comparar la instancias.

        if(connection1 == connection2) 
            System.out.println("Son la misma instancia");
        else 
            System.out.println("No son la misma instancia");
        
    }
}
